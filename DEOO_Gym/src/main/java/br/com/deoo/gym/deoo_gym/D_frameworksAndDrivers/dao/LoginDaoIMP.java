package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.dao;


import br.com.deoo.gym.deoo_gym.A_entity.User;

import java.util.*;


public class LoginDaoIMP implements LoginDAO {


    private static LoginDaoIMP instance;
    private List<User> users;

    public LoginDaoIMP() {
        users = new ArrayList<>() {
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
//    public boolean addUser(String name, String password, String email){
//        for (User u : users) {
//            if (u.getEmail().equals(email)) {
//                return false; // Retorna falso se o email já estiver em uso
//            }
//        }
//        // Adiciona o usuário à lista e retorna verdadeiro
//        return users.add(new User(name, email, password));
//    }

    @Override    // Método para buscar um usuário por email e senha
    public boolean findUser(String email, String password) {
        for (User usuario : users) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
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
    public boolean editUser(String email, String password, String novaSenha, String novoE) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                if (verificaEmail(novoE)) {
                    u.setPassword(novaSenha); // Atualiza a senha do usuário
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
    public boolean deleteUser(String email, String password) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
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

    public boolean deleteUser(User user) {
        for (User u : users) {
            if (u.equals(user)) {
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

    @Override
    public List<User> getAll() {
        return users;
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

