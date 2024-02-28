public class Cliente {
    //1. Definindo atributos
     public int codigo;
     public String nome;
     public String email;

     //2. Método especial - construtor
     public Cliente(int codigo, String nome, String email){
         this.codigo = codigo;
         this.nome = nome;
         this.email = email;
     }

     //3. método da classe
     public void apresentar(){
         System.out.println("Dados do cliente: ");
         System.out.println("codigo = " + codigo);
         System.out.println("nome = " + nome);
         System.out.println("email = " + email);
     }


}
