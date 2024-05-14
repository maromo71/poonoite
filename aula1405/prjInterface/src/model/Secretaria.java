package model;

import view.GerenciarAcessos;

import java.time.LocalDateTime;

public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void login() {
        System.out.println("Secretária logou no sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Secretária saiu do sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.remove(this);
    }
}
