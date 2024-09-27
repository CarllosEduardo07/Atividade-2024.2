const { Pool } = require('pg');
require('dotenv').config();

const poll = new Pool({
  user: process.env.DB_USER,
  host: process.env.DB_HOST,
  database: process.env.DB_DATABASE,
  port: process.env.DB_PORT,
});
console.log(poll);

module.exports = poll