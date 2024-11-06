import model.Aluno;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(66, "Maria");
        Aluno aluno2 = new Aluno(13, "Joaquim Jose");
        Aluno aluno3 = new Aluno(12, "Antonio");

        System.out.println("Hashcode de aluno 1: " + aluno1.hashCode());
        System.out.println("Hashcode de aluno 2: " + aluno2.hashCode());
        System.out.println("Hashcode de aluno 3: " + aluno3.hashCode());

        System.out.println(aluno1.equals(aluno2));
        List<Aluno>lista = new ArrayList<Aluno>();
        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        Collections.sort(lista, (a1, a2) -> a1.compareTo(a2));
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Digite o RA do Aluno a ser procurado: ");
        Aluno aluProc = new Aluno();
        aluProc.setRa(Integer.parseInt(sc.nextLine()));
        //Verificar a exitencia do aluno procurado
        if(lista.contains(aluProc)){
            int index = lista.indexOf(aluProc);
            aluProc = lista.get(index);
            System.out.println("Nome do Aluno encontrado: " + aluProc.getNome());
        }else{
            System.out.println("Não está na lista");
        }
        */
        for (Aluno aluno : lista) {
            System.out.println("Ra: " + aluno.getRa());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println();
        }

    }
}
