const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(bodyParser.json());

// Sample data
let products = [
  { id: 1, name: 'Product 1', price: 10.99, quantity: 100 },
  { id: 2, name: 'Product 2', price: 20.49, quantity: 50 }
];

// GET all products
app.get('/products', (req, res) => {
  res.json(products);
});

// GET a single product
app.get('/products/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const product = products.find(product => product.id === id);
  if (!product) {
    res.status(404).json({ message: 'Product not found' });
  } else {
    res.json(product);
  }
});

// POST a new product
app.post('/products', (req, res) => {
  const product = req.body;
  product.id = products.length + 1;
  products.push(product);
  res.status(201).json(product);
});

// PUT update a product
app.put('/products/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const productIndex = products.findIndex(product => product.id === id);
  if (productIndex === -1) {
    res.status(404).json({ message: 'Product not found' });
  } else {
    products[productIndex] = req.body;
    products[productIndex].id = id;
    res.json(products[productIndex]);
  }
});

// PATCH update a product
app.patch('/products/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const productIndex = products.findIndex(product => product.id === id);
  if (productIndex === -1) {
    res.status(404).json({ message: 'Product not found' });
  } else {
    products[productIndex] = { ...products[productIndex], ...req.body };
    res.json(products[productIndex]);
  }
});

// DELETE a product
app.delete('/products/:id', (req, res) => {
  const id = parseInt(req.params.id);
  products = products.filter(product => product.id !== id);
  res.status(204).send();
});

// Start server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
