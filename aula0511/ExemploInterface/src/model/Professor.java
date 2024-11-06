package model;

import utils.GerenciarLogin;

public class Professor extends Funcionario implements Logavel{
    @Override
    public void login() {
        System.out.println("Professor logou: " + getNome());
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Professor saiu: " + getNome());
        GerenciarLogin.logados.remove(this);
    }
}
