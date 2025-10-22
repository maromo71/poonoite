import model.Carro;
import model.Cliente;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
        // 1 cliente que possui dois carros.
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        //Definir os dados do carro 1
        carro1.setModelo("Frontier");
        carro1.setMarca("Nissan");
        carro1.setAno(2018);
        carro1.setCor("Prata");

        //Definir os dados do carro 2
        carro2.setModelo("A3");
        carro2.setMarca("Audi");
        carro2.setAno(2010);
        carro2.setCor("Preta");

        //Jose possui esses dois carros
        Cliente cliente = new Cliente();
        cliente.setNome("Jose");
        cliente.setEmail("emaildoze@gmail.com");
        cliente.setMensalidade(200.0);
        cliente.setTelefone("19-7070707070");
        cliente.adicionarCarro(carro1);
        cliente.adicionarCarro(carro2);

        System.out.println(cliente);
    }

}
