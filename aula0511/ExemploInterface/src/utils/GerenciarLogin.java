package utils;

import model.Logavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciarLogin {

    public static List<Logavel> logados = new ArrayList<>();

    public void imprimirLogados(){
        for(Logavel log : logados){
            System.out.println(log);
        }
    }
}
