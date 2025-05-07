import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Ana", "ADS");
        Pessoa pessoa2 = new Pessoa(2, "Maromo", "ADS");
        Pessoa pessoa3 = new Pessoa(3, "Marcos", "ADS");
        Pessoa pessoa4 = new Pessoa(4, "Ana", "ADS");
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.equals(pessoa4));
        HashSet<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        System.out.println("Quantidade de elementos na lista: " + pessoas.size());
    }

}
