const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(bodyParser.json());

// Sample data
let tasks = [
  { id: 1, name: 'Task 1', completed: false },
  { id: 2, name: 'Task 2', completed: true }
];

// GET all tasks
app.get('/tasks', (req, res) => {
  res.json(tasks);
});

// GET a single task
app.get('/tasks/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const task = tasks.find(task => task.id === id);
  if (!task) {
    res.status(404).json({ message: 'Task not found' });
  } else {
    res.json(task);
  }
});

// POST a new task
app.post('/tasks', (req, res) => {
  const task = req.body;
  task.id = tasks.length + 1;
  tasks.push(task);
  res.status(201).json(task);
});

// PUT update a task
app.put('/tasks/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const taskIndex = tasks.findIndex(task => task.id === id);
  if (taskIndex === -1) {
    res.status(404).json({ message: 'Task not found' });
  } else {
    tasks[taskIndex] = req.body;
    tasks[taskIndex].id = id;
    res.json(tasks[taskIndex]);
  }
});

// PATCH update a task
app.patch('/tasks/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const taskIndex = tasks.findIndex(task => task.id === id);
  if (taskIndex === -1) {
    res.status(404).json({ message: 'Task not found' });
  } else {
    tasks[taskIndex] = { ...tasks[taskIndex], ...req.body };
    res.json(tasks[taskIndex]);
  }
});

// DELETE a task
app.delete('/tasks/:id', (req, res) => {
  const id = parseInt(req.params.id);
  tasks = tasks.filter(task => task.id !== id);
  res.status(204).send();
});

// Start server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
