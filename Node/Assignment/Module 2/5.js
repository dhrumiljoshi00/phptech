const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

// Set up static files directory
app.use(express.static('public'));

// Define the route for the homepage
app.get('/', (req, res) => {
  res.sendFile(__dirname + '/index.html');
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>World Clock</title>
  <link rel="stylesheet" href="/styles/style.css">
</head>
<body>
  <h1>World Clock</h1>
  <div id="clocks">
    <div class="clock" id="clock-london">
      <h2>London</h2>
      <div class="time"></div>
    </div>
    <div class="clock" id="clock-new-york">
      <h2>New York</h2>
      <div class="time"></div>
    </div>
    <!-- Add more clocks for other cities -->
  </div>

  <script src="/scripts/script.js"></script>
</body>
</html>


body {
  font-family: Arial, sans-serif;
  text-align: center;
}

.clock {
  display: inline-block;
  margin: 20px;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

.time {
  font-size: 24px;
  font-weight: bold;
}
