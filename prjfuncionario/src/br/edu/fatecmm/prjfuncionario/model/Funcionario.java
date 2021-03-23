package br.edu.fatecmm.prjfuncionario.model;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void bonificar(double valor){
        if (valor <=0) {
            throw new IllegalArgumentException("Valor inválido para bonificação");
        }
        salario+= valor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", rg='" + rg + '\'' +
                ", estaNaEmpresa=" + estaNaEmpresa +
                '}';
    }
}
