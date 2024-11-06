package model;

import utils.GerenciarLogin;

public class Diretor extends Funcionario implements Logavel{
    @Override
    public void login() {
        System.out.println("Diretor logou: " + getNome());
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Diretor saiu: " + getNome());
        GerenciarLogin.logados.remove(this);
    }
}
