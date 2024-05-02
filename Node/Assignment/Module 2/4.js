app.js
const express = require('express');
const hbs = require('hbs');
const axios = require('axios');

const app = express();
const PORT = process.env.PORT || 3000;

// Set up Handlebars as the view engine
app.set('view engine', 'hbs');

// Set the directory for views
app.set('views', __dirname + '/views');

// Set up static files directory
app.use(express.static('public'));

// Define the route for the homepage
app.get('/', (req, res) => {
  res.render('index');
});

// Define route to handle weather data request
app.get('/weather', async (req, res) => {
  try {
    const city = req.query.city;
    const apiKey = 'YOUR_API_KEY'; // Replace with your actual API key
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}`;
    
    const response = await axios.get(url);
    const weatherData = response.data;

    res.json(weatherData);
  } catch (error) {
    res.status(500).json({ message: 'Internal server error' });
  }
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});

index.hbs

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Weather App</title>
  <link rel="stylesheet" href="/styles/style.css">
</head>
<body>
  <h1>Weather App</h1>
  <form action="/weather" method="GET">
    <input type="text" name="city" placeholder="Enter city">
    <button type="submit">Get Weather</button>
  </form>
  <div id="weather-result"></div>
</body>
</html>


style.css

body {
  font-family: Arial, sans-serif;
}

form {
  margin-bottom: 20px;
}

#weather-result {
  margin-top: 20px;
}
