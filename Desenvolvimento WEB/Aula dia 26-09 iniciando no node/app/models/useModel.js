const poll = require('../../config');

const user = {
  getAll: async () => {
    const result = await poll.query(/*sql*/ 'SELECT * FROM users');
    return result.rows;
  },
  getById: async id => {
    const result = await poll.query('SELECT * FROM user where id = $1', [id]);
    return result.rows[0];
  },
  create: async (name, email) => {
    const result = await poll.query('INSERT INTO user (name,email) VALUES ($1, $2) RETURNING *', [name, email]);
    return result.rows[0];
  },
  update: async (id, name, email) => {
    const result = /* sql */ await poll.query('UPDATE users SET name = $1, email = $2 WHERE id = $3 returning *', [name, email, id]);
    return result.rows[0];
  },
};

console.log(poll);
