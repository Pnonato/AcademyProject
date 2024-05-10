package br.com.deoo.gym.deoo_gym.A_entity;

//interface para fazer o uso da inversao de dependencia, mantendo os principios da arquitetura limpa
//essa interface tem como funcao pegar os dados da classe de caracteristicas e separar eles da implementação para
//serem enviados para a classe que calcula o IMC
public interface PhysicalCharacteristicsReader {
    double getWeigth();
    double getHeigth();
}
