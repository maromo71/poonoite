package model;

import utils.GerenciarAcesso;

public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Secretaria efetuou login");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Secretaria saiu do sistema");
        GerenciarAcesso.logados.remove(this);
    }
}
