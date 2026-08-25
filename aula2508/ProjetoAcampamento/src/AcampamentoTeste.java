import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//ler uma entrada
        Acampamento membro = new Acampamento();//criamos o objeto
        System.out.println("Digite o nome do membro do acampamento: ");
        membro.setNome(sc.nextLine());//atributos um string
        System.out.println("Digite a idade da pessoa: ");
        membro.setIdade(Integer.parseInt(sc.nextLine()));//atribuimos inteiro
        membro.imprimir(); //impressao antes de separar o grupo
        membro.separarGrupo(); //aplica logica de separar o grupo
        System.out.println(); //pular linha
        membro.imprimir(); //impressao com a logica do grupo separado.

    }
}
