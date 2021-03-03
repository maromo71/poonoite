package br.edu.fatecmm.prjpessoa.modelo;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private Endereco endereco;
    public static int total = 0;

    public Pessoa(){
        total = total + 1;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        texto.append("Id: ").append(idPessoa).append('\n');
        texto.append("Nome: ").append(nome).append('\n');
        texto.append("Endereco Completo: \n");
        texto.append("Logradouro: " + endereco.getLogradouro()).append('\n');
        texto.append("Numero: " + endereco.getNumero()).append('\n');
        texto.append("Cidade: " + endereco.getCidade()).append('\n');
        texto.append("Estado: " + endereco.getEstado()).append('\n');
        texto.append("Total de pessoas no momento: ").append(total).append('\n');
        return texto.toString();
    }
}
