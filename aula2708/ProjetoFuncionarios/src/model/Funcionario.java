package model;

public class Funcionario {
    private String departamento;
    private double salario;
    private String rg;
    private String nome;
    private Boolean ativo;

    //construtor
    public Funcionario(String departamento, double salario, String rg, String nome) {
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.nome = nome;
        this.ativo = true;
    }

    //getters and setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Dados do empregado: \n" +
                "Nome: " + nome + "\n" +
                "RG: " + rg + "\n" +
                "Departamento: " + departamento + "\n" +
                "Salário: " + salario + "\n" +
                "Está ativo: " + ativo + "\n";
    }

    public void bonificar(double valor){
        salario += valor;
    }
}
