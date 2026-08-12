public class GerenciarFatec {
    public static void main(String[] args) {
        //Criar dois objetos do tipo aluno
        //Matricular ambos
        //Cancelar a matricula de um deles
        Aluno aluno1 = new Aluno();
        aluno1.ra = 111;
        aluno1.nome = "Maria da Silva";
        aluno1.email = "maria@gmail.com";
        aluno1.setTurma("3. Semestre");

        Aluno aluno2 = new Aluno();
        aluno2.ra = 222;
        aluno2.email = "emaildojoao@gmail.com";
        aluno2.setTurma("3. semestre");
        aluno2.nome = "Joao Barbosa";

        aluno2 = aluno1;

        aluno1.matricular();
        System.out.println(); //pular linha
        aluno2.matricular();

        System.out.println();
        aluno2.cancelarMatricula();
    }
}
