package br.edu.fatecmm.prjestacionamento.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String email;
    private String telefone;
    private List<Carro> carros = new ArrayList<>();

    public Pessoa(int idPessoa, String nome, String email, String telefone) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public void removerCarro(Carro carro){
        carros.remove(carro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Clientes e Veículo(s): \n");
        sb.append("Id da Pessoa: " + idPessoa + "\n");
        sb.append("Nome da Pessoa: " + nome + "\n");
        sb.append("Email da Pessoa: " + email + "\n");
        sb.append("Telefone da Pessoa: " + telefone + "\n");
        sb.append("Dados do(s) Veículo(s)\n");
        for (Carro carro: carros) {
            sb.append("Id do Carro: " + carro.getIdCarro() + "\n");
            sb.append("Marca: " + carro.getMarca() + "\n");
            sb.append("Modelo: " + carro.getModelo() + "\n");
            sb.append("----------------------------------------\n");
        }
        return sb.toString();
    }
}
