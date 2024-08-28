package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    //atributos privados
    private String nome;
    private String documento;
    private String endereco;
    private String email;
    private List<Carro> carros = new ArrayList<>();

    //método construtor
    public Pessoa(String nome, String documento, String endereco, String email) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.email = email;
    }

    //métodos modificadores de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //Sobrescrita do método toString()

    @Override
    public String toString() {
        return "Dados da Pessoa: \n" +
                "Nome: " + nome + "\n" +
                "Documento: " + documento + "\n" +
                "Endereço: " + endereco +  "\n" +
                "Email: " + email + "\n";
    }

    //logica do negocio
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarros(){
        for(Carro carro: carros){
            System.out.println(carro);
        }
    }
}
