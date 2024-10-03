const User = require('../models/userModel');

const userController = {
  getAllUsers: async (req, res) => {
    try {
      const users = await User.getAllUsers();
      res.json(users);
    } catch (error) {
      res.status(500).json({ error: 'Erro ao Obter Usuario' });
    }
  },

  getUserById: async (req, res) => {
    try {
      const { id } = req.params;
      const user = await User.getUserById(id);

      if (user) {
        res.json(user);
      } else {
        res.status(404).json({ erro: 'usuario nao encontrado' });
      }
    } catch (error) {
      res.status(500).json({ erro: 'Erro ao Obter Usuario' });
    }
  },

  createUser: async (req, res) => {
    try {
      const { name, email } = res.params;
      const newUser = await User.createUser(name, email);

      res.status(201).json({ newUser: 'novo Usuario Criado' });
    } catch (error) {
      res.status(500).json({ erro: 'Erro ao criar usuario' });
    }
  },
  updateUser: async (req, res) => {
    try {
      const { id, name, email } = res.params;
      const updateUser = await User.update(id, name, email);
      if (updateUser) {
        res.status(201).json({ updateUser: 'Usuario Atualizado' });
      } else {
        res.status(404).json({ error: 'usuario nao encontrado' });
      }
    } catch (error) {
      res.status(500).json({ erro: 'Erro ao Atualizar usuario' });
    }
  },
  deleteUser: async (req, res) => {
    try {
      const { id } = res.params;
      const deleteUser = await User.update(id);
      if (deleteUser) {
        res.status(201).json({ updateUser: 'Usuario excluido' });
      } else {
        res.status(404).json({ error: 'usuario nao encontrado' });
      }
    } catch (error) {
      res.status(500).json({ erro: 'Erro ao deletar usuario' });
    }
  },
};
