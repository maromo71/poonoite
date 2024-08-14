import model.Aluno;

public class GerenciarEscola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno.unidade = "Fatec Araraquara";
        aluno1.ra = 111;
        aluno1.nome = "Maria";
        //imprimir os dados do aluno1
        aluno1.imprimir();
        Aluno aluno2 = new Aluno();
        aluno2.ra = 222;
        aluno2.nome = "Joao";

        aluno2.imprimir();
        aluno1.imprimir();

    }
}