import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do membro do acampamento:");
        membro.nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        System.out.println(); //pular uma linha
        membro.separarGrupo(); //separar o grupo
        membro.imprimir();
    }
}