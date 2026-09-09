public class Pessoa {
    public String nome;
    public Mes mesAniversario;

    public Pessoa(String nome, Mes mesAniversario){
        this.nome = nome;
        this.mesAniversario = mesAniversario;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Mes:" + mesAniversario);
    }

}
