public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
