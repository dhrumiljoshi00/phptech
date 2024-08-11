// server.js
const express = require('express');
const cors = require('cors');
const app = express();
const port = 5000;

// Middleware
app.use(cors()); // Enable CORS for all origins
app.use(express.json()); // Parse JSON bodies

// Sample data
const data = [
  { id: 1, name: 'Item 1' },
  { id: 2, name: 'Item 2' },
];

// Routes
// GET all items
app.get('/api/items', (req, res) => {
  res.json(data);
});

// GET an item by ID
app.get('/api/items/:id', (req, res) => {
  const item = data.find(i => i.id === parseInt(req.params.id));
  if (item) {
    res.json(item);
  } else {
    res.status(404).json({ message: 'Item not found' });
  }
});

// POST a new item
app.post('/api/items', (req, res) => {
  const newItem = {
    id: data.length + 1,
    name: req.body.name,
  };
  data.push(newItem);
  res.status(201).json(newItem);
});

// PUT to update an item
app.put('/api/items/:id', (req, res) => {
  const item = data.find(i => i.id === parseInt(req.params.id));
  if (item) {
    item.name = req.body.name;
    res.json(item);
  } else {
    res.status(404).json({ message: 'Item not found' });
  }
});

// DELETE an item
app.delete('/api/items/:id', (req, res) => {
  const index = data.findIndex(i => i.id === parseInt(req.params.id));
  if (index !== -1) {
    data.splice(index, 1);
    res.status(204).end(); // No content
  } else {
    res.status(404).json({ message: 'Item not found' });
  }
});

// Start server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
