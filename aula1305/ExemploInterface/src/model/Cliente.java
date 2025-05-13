package model;

import utils.GerenciarAcesso;

public class Cliente implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Cliente logou com sucesso");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Cliente saiu do sistema");
        GerenciarAcesso.logados.remove(this);
    }
}
