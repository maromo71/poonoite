public class Aluno {
    // 1. Definir atributos
    public int ra;
    public String nome;
    public String email;
    private String turma;

    //2. Definir os métodos
    public void matricular(){
        System.out.println("Aluno de RA: " + ra + " foi matriculado");
        System.out.println("Seja bem vindo " + nome);
    }
    public void cancelarMatricula(){
        System.out.println("Aluno " + nome + " matricula foi cancelada");
    }

    //3. Métodos de leitura e gravacao sets and sets
    public String getTurma(){
        return turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
}
