package br.com.deoo.gym.deoo_gym.B_useCases;

import br.com.deoo.gym.deoo_gym.A_entity.User;

public interface Login {

    User authenticateUser(String email, String password);
}