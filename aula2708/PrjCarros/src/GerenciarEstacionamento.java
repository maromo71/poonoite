import model.Carro;
import model.Pessoa;

public class GerenciarEstacionamento {
    public static void main(String[] args) {
        //Dois clientes, um com um carro, outro com dois carros
        Pessoa p1 = new Pessoa("Maria", "RG 1",
                "Rua tal, 12", "emaildamaria@ii.com");
        Pessoa p2 = new Pessoa("José", "RG 2",
                "Rua tal, 121", "emaildoze@ig.com");
        Carro carro1 = new Carro("Fiat", "Pulse", 2023,
                "FIP-7U90");
        Carro carro2 = new Carro("Hyundai", "Santa Fé", 2015,
                "FFF-8X99");
        Carro carro3 = new Carro();
        carro3.setMarca("VW");
        carro3.setModelo("Polo");
        carro3.setAno(2021);
        carro3.setPlaca("XXX-9X99");
        //dois primeiros carro para a primeira pessoa
        p1.adicionarCarro(carro1);
        p1.adicionarCarro(carro2);
        //segunda pessoa, tem o carro3
        p2.adicionarCarro(carro3);
        //Exibir os dados da pessoa1.
        System.out.println(p1);
        //Carros que a pessoa 1 tem
        p1.listarCarros();
        System.out.println(); //pular linha
        //Exibir os dados da pessoa2
        System.out.println(p2);
        //Exibir os carros da pessoa2 (é só o carro3)
        p2.listarCarros();
    }
}
