package model;

import utils.GerenciarLogin;

public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void login() {
        System.out.println("Secretaria logou: " + getNome());
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Secretaria saiu: " + getNome());
        GerenciarLogin.logados.remove(this);
    }
}
