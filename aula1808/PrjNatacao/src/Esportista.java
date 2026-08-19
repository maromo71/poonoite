public class Esportista {
    //Atributos
    public int id;
    public String nome;
    public int idade;
    private String categoria;

    public void classificar(){
        if(idade < 11){
            categoria = "Infantil";
            return;
        }
        if(idade < 18){
            categoria = "Juvenil";
            return;
        }
        categoria = "Adulto";
    }

    public void imprimir(){
        System.out.println("Dados do Esportista");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Categoria: " + categoria);
    }
}
