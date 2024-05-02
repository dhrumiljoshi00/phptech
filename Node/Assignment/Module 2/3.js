// Importing necessary modules
const express = require('express');

// Creating an instance of Express
const app = express();

// Define a route for the homepage
app.get('/', (req, res) => {
  res.send('Hello, World!');
});

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
