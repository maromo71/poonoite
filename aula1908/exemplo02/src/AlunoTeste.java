public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.matricula = 1234;
        aluno.nome = "Joaquim";
        aluno.curso = "ADS";

        System.out.println(aluno); //nome da classe + hashCode


    }
}
