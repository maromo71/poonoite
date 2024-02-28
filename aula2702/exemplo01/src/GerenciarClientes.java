public class GerenciarClientes {
    public static void main(String[] args) {
       //Cadastrar dois clientes
       Cliente cli1, cli2, cli3 = null;
       cli1 = new Cliente(1,"Maria", "maria@gmail.com");
       cli2 = new Cliente(2, "José", "jose@gmail.com");
       cli1.apresentar();
       System.out.println(); //pular linha
       cli2.apresentar();
       cli3 = cli1;
       cli3.nome = "outro nome";
       cli1.apresentar();
       //Slide 6 do material 3.
    }
}