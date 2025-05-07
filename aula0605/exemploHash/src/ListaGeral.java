import java.util.ArrayList;
import java.util.List;

public class ListaGeral {
    public static void main(String[] args) {
        List lista = new ArrayList(); //lista geral
        lista.add(1);
        lista.add(System.currentTimeMillis());
        lista.add("ADS");
        lista.add(12.56);
        lista.add("Ana");
        lista.add("ADS");

        while(lista.contains("ADS")) lista.remove("ADS");
        for(Object item : lista){
            System.out.println(item);
        }
        //tamanho da lista
        System.out.println("Tamanho: " + lista.size());
        //tem "ADS" na lista
        System.out.println("ADS ? : " + lista.contains("ADS"));
    }
}
