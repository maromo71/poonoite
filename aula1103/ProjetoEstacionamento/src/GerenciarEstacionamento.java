public class GerenciarEstacionamento {

    public static void main(String[] args) {
        Cliente cliente1, cliente2;
        Carro carro1, carro2, carro3;

        cliente1 = new Cliente();
        cliente1.setCodigo(1);
        cliente1.setNomeCliente("Maromo");
        cliente1.setEmail("maromo@gmail.com");

        carro1 = new Carro();
        carro1.setMarca("Hyundai");
        carro1.setModelo("Santa Fé");
        carro1.setAno(2015);
        carro1.setPlaca("FFF-9999");

        carro2 = new Carro();
        carro2.setMarca("Fiat");
        carro2.setModelo("Pulse");
        carro2.setAno(2023);
        carro2.setPlaca("KKK-1212");

        cliente1.imprimir();
        //Agora ligando os carros ao cliente
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);
        cliente1.imprimir();
    }
}
