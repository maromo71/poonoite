package net.maromo.model;

public class Aluno extends Usuario {
    private String matricula;
    private String curso;
    
    public Aluno(int idUsuario, String nome, String email, String matricula, String curso) {
        super(idUsuario, nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Matricula=" + matricula + "\n" +
                "Curso=" + curso + "\n";
    }
    
}
