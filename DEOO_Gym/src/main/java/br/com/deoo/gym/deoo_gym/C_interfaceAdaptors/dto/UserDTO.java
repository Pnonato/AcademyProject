package br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dto;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;

public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String senha;
    private int count;
    private PhysicalCharacteristics characteristic;

    private UserDTO(){
        this.id = ++count;
    }
    public UserDTO(String name, String email, String senha, PhysicalCharacteristics characteristic) {
        this();
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.characteristic = characteristic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalCharacteristics getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(PhysicalCharacteristics characteristic) {
        this.characteristic = characteristic;
    }
}
