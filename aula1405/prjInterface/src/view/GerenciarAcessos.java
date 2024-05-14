package view;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAcessos {
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        //5 pessoas logaram, 1 delas saiu do sistema
        Operador operador = new Operador();
        //sem login para operador ou fornecedor
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Secretaria secretaria = new Secretaria();
        Gerente gerente = new Gerente();
        Secretaria secDaTarde = new Secretaria();
        cliente1.login();
        cliente2.login();
        secretaria.login();
        gerente.login();
        secDaTarde.login();
        listarLogados();
        secDaTarde.logout();
        listarLogados();
    }

    public static void listarLogados(){
        System.out.println("Logado no momento");
        System.out.println("Total de logados: " + logados.size());
        for (Logavel o : logados){
            System.out.println("Logado: " + o);
        }
    }
}