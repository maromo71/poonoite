package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private double mensalidade;
    //Associacao
    private List<Carro> carros = new ArrayList<>();

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

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
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

    @Override
    public String toString() {
        StringBuilder dadosCarros = new StringBuilder();
        for (Carro carro : carros) {
            dadosCarros.append(carro.toString()).append("\n");
        }
        return "Cliente: \n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Telefone: " + telefone +  "\n" +
                "Mensalidade: " + mensalidade + "\n" +
                "Carros: " + dadosCarros + "\n";

    }
}
