// 1. Set up your Node.js project with Express
const express = require('express');
const app = express();
const port = 3000;

// Middleware for parsing JSON bodies
app.use(express.json());

// 2. Implement user registration, login, and token generation
let users = [];

// Register a new user
app.post('/register', (req, res) => {
    const { username, password } = req.body;
    const user = { username, password, token: generateToken() };
    users.push(user);
    res.send('User registered successfully!');
});

// Login
app.post('/login', (req, res) => {
    const { username, password } = req.body;
    const user = users.find(u => u.username === username && u.password === password);
    if (user) {
        user.token = generateToken(); // Generate a new token upon login
        res.json({ token: user.token });
    } else {
        res.status(401).send('Invalid credentials');
    }
});

// Generate token function
function generateToken() {
    return Math.random().toString(36).substr(2);
}

// 3. Implement session management using cookies or JWT tokens
// In this example, we'll use JWT tokens for session management

// 4. Create routes for CRUD operations
// Example routes
app.get('/api/data', authenticateToken, (req, res) => {
    // Handle GET request
});

app.post('/api/data', authenticateToken, (req, res) => {
    // Handle POST request
});

// 5. Implement logout functionality
// Logout from one device
app.post('/logout', authenticateToken, (req, res) => {
    // Invalidate token for the current device
    const user = users.find(u => u.token === req.token);
    if (user) {
        user.token = null;
        res.send('Logged out successfully from this device.');
    } else {
        res.status(401).send('Unauthorized');
    }
});

// Logout from all devices
app.post('/logout-all', authenticateToken, (req, res) => {
    // Invalidate token for all devices
    const user = users.find(u => u.token === req.token);
    if (user) {
        users.forEach(u => {
            if (u.username === user.username) {
                u.token = null;
            }
        });
        res.send('Logged out successfully from all devices.');
    } else {
        res.status(401).send('Unauthorized');
    }
});

// Middleware for token authentication
function authenticateToken(req, res, next) {
    const token = req.headers['authorization'];
    if (token == null) return res.sendStatus(401);

    // Validate token
    // You might use a JWT library like jsonwebtoken to verify the token
    // Here, for simplicity, we're assuming the token is stored in the users array
    req.token = token;
    next();
}

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
