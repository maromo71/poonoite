package model;

import utils.GerenciarAcesso;

public class Gerente extends Funcionario implements Logavel {
    @Override
    public void efetuarLogin() {
        System.out.println("Gerente logou com sucesso!");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Gerente saiu do sistema");
        GerenciarAcesso.logados.remove(this);
    }
}
