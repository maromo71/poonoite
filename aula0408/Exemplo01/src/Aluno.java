public class Aluno {
    //1 Definir os atributos
    public int ra;
    public String nome;
    public String email;
    private double salario;

    //2 Definir os métodos
    public void matricular(){
        System.out.println("Aluno matriculado");
        System.out.println("Num do RA: "+ ra);
        System.out.println("Nome do Aluno:"+ nome);
    }
    public void cancelarMatricula(){
        System.out.println("Mat cancelada com sucesso");
    }
    public void imprimirDados(){
        System.out.println("Dados do Aluno");
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
    }
}
