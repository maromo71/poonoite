package model;

import view.GerenciarAcessos;

import java.time.LocalDateTime;

public class Gerente extends Funcionario implements Logavel{
    @Override
    public void login() {
        System.out.println("Gerente logou no sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Gerente saiu do sistema: " +
                LocalDateTime.now());
        GerenciarAcessos.logados.remove(this);
    }
}
