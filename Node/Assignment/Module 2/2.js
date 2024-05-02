// Importing necessary modules
const express = require('express');

// Creating an instance of Express
const app = express();

// Define a route for the homepage
app.get('/', (req, res) => {
  res.send('Hello, World!');
});

// Define a route for a sample endpoint
app.get('/api/sample', (req, res) => {
  res.json({ message: 'This is a sample endpoint' });
});

// Define a route for handling 404 errors
app.use((req, res, next) => {
  res.status(404).send("Sorry, can't find that!");
});

// Define a route for handling errors
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send('Something broke!');
});

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
