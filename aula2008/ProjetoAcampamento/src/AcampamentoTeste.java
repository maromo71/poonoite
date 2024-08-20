import model.Acampamento;

import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do membro: ");
        membro.nome = leitor.nextLine();
        System.out.println("Digite a idade do membro: ");
        membro.idade = Integer.parseInt(leitor.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}
