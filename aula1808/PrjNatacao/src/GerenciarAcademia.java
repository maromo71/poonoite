import java.util.Scanner;

public class GerenciarAcademia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Esportista esportista = new Esportista();
        System.out.println("Digite o codigo id do Esportista: ");
        esportista.id = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do aluno: ");
        esportista.nome = sc.nextLine();
        System.out.println("Digite a idade do aluno: ");
        esportista.idade = Integer.parseInt(sc.nextLine());

        //classificar o esportista
        esportista.classificar();

        esportista.imprimir();
    }

}
