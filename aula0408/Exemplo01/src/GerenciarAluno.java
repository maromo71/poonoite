public class GerenciarAluno {
    public static void main(String[] args) {
        //1. Definir dois novos alunos
        Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        aluno2 = new Aluno();
        //Definir os alunos
        aluno1.ra = 11;
        aluno1.nome = "Pedro Paulo";
        aluno1.email = "pp@gmail.com";

        aluno2.ra = 12;
        aluno2.nome = "Maria Silva";
        aluno2.email = "maria@uol.com.br";

        //Matricular aluno 1
        aluno1.matricular();

        //Mostrar os dados do aluno1
        aluno1.imprimirDados();
    }
}
