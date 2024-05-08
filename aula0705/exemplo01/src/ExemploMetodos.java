import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExemploMetodos {
    public static void main(String[] args) {
        List lista = new ArrayList();
        //adicionando elementos na lista
        lista.add(33);
        lista.add("Marcelo");
        lista.add(System.currentTimeMillis());
        lista.add(23.4);
        lista.add(Math.PI);
        lista.add(33);
        //quantos elementos ?
        System.out.println("Tam da lista: " + lista.size());
        //mostrando os elementos
        for(Object x : lista){
            System.out.println(x);
        }
        //Tem Marcelo na Lista
        System.out.println(lista.contains("Marcelo"));
        lista.remove("Marcelo");
        System.out.println("-----");
        //mostrando os elementos
        for(Object x : lista){
            System.out.println(x);
        }
        while(lista.contains(33)){
            lista.remove((Integer)33);
        }

        //mostrando os elementos
        System.out.println("--------");
        for(Object x : lista){
            System.out.println(x);
        }


    }
}
