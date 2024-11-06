import java.util.ArrayList;
import java.util.List;

public class Teste3 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(15);
        lista.add("Maria");
        lista.add(20.55);
        lista.add("Maria");
        lista.remove((Integer)15);

        lista.add('c');
        lista.add(System.currentTimeMillis());
        while(lista.contains("Maria")) lista.remove("Maria");
        System.out.println("Total de itens: " + lista.size());
        for(Object item : lista) {
            System.out.println(item);
        }
        System.out.println(lista.contains("Maria"));

    }
}
