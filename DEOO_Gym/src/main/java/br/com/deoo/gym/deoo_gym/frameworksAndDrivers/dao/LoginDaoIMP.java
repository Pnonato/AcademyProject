package br.com.deoo.gym.deoo_gym.frameworksAndDrivers.dao;


import br.com.deoo.gym.deoo_gym.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LoginDaoIMP implements LoginDAO {


    private static LoginDaoIMP instance;
    private Set<User> users;

    public LoginDaoIMP() {
        users = new HashSet<>() {
        };
    }

    public static LoginDaoIMP getInstance() {
        return instance == null ? new LoginDaoIMP() : instance;
    }

    // Método para adicionar um novo usuário
    @Override
    public boolean addUser(User usuario) {
        // Verifica se já existe um usuário com o mesmo email
        for (User u : users) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return false; // Retorna falso se o email já estiver em uso
            }
        }
        // Adiciona o usuário à lista e retorna verdadeiro
        return users.add(usuario);
    }

    @Override    // Método para buscar um usuário por email e senha
    public boolean findUser(String email, String senha) {
        for (User usuario : users) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true; // Retorna verdadeiro se encontrar o usuário
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para buscar um usuário por ID
    public boolean findUser(int id) {
        for (User usuario : users) {
            if (usuario.getId() == id) {
                return true; // Retorna verdadeiro se encontrar o usuário
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para atualizar a senha de um usuário
    public boolean editUser(String email, String senha, String novaSenha, String novoE) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                if (verificaEmail(novoE)) {
                    u.setSenha(novaSenha); // Atualiza a senha do usuário
                    u.setEmail(novoE);
                    return true;
                } else {
                    return false;
                }


            }
        }
        return false; // Retorna falso se o usuário não for encontrado ou a senha não puder ser atualizada
    }

    // Método para excluir um usuário por email e senha
    public boolean deleteUser(String email, String senha) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return users.remove(u); // Remove o usuário da lista e retorna verdadeiro
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }


    // Método para excluir um usuário por ID
    public boolean deleteUser(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return users.remove(u); // Remove o usuário da lista e retorna verdadeiro
            }
        }
        return false; // Retorna falso se o usuário não for encontrado
    }

    // Método para buscar um usuário por ID em uma lista específica de usuários
    public User findUser(int id, List<User> users) {

            if (users == null) {
                throw new NullPointerException("Lista de usuários é nula.");
            }

            User user = null;
            for (User u : users) {
                if (u.getId() == id) {
                    user = u;
                    break; // Sai do loop assim que o usuário for encontrado
                }
            }

            return user;
    }


    private boolean verificaEmail(String email) {
        boolean verifica = true;

        for (User u : users) {
            if (u.getEmail().equals(email)) {
                verifica = false;

            }

        }


        return verifica;
    }


}

