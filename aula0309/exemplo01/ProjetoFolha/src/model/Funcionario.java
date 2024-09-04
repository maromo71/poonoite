package model;

public class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private double salario;

    //Construtor padrão - nem precisava
    public Funcionario(){

    }

    //getters and setters

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    //adaptar de acordo com a Regra de Negócio
    public double getSalario(TipoUsuario tipoUsuario) {
        if(tipoUsuario == TipoUsuario.ADMIN){
            return salario;
        }
        throw new IllegalArgumentException("Sem permissão de acesso");
    }

    public void setSalario(double salario, TipoUsuario tipoUsuario) {
        if(tipoUsuario == TipoUsuario.ADMIN){
            this.salario = salario;
            return;
        }
        throw new IllegalArgumentException("Sem permissão para mudar salário");
    }
}
