const express = require('express');
const userRoutes = require('./routes/userRoutes');
const app = express();

app.use(express.json());
// app.use('/api', userRoutes);

const port = process.env.PORT || 3000;

app.get('/', (req, res) => {
  res.send('ok');
});

app.listen(port, () => {
  console.log(`servidor rodando http://localhost:${port}`);
});
