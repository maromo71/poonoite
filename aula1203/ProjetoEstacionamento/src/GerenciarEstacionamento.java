public class GerenciarEstacionamento {
    public static void main(String[] args) {
        //1 cliente e 2 carros
        Cliente cliente = new Cliente();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        //Dados do cliente
        cliente.setNome("Maria Silva");
        cliente.setTelefone("99-9999-9999");
        cliente.setEmail("email@gmail.com");

        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setAno(2005);
        carro1.setPreco(10000);

        carro2.setMarca("Chevrolet");
        carro2.setModelo("Equinox");
        carro2.setAno(2018);
        carro2.setPreco(100000);

        //Adicionando os dois carros na lista da Maria
        cliente.adicionarCarro(carro1);
        cliente.adicionarCarro(carro2);

        //Exibir os dados da Maria, inclusive dos carros
        cliente.exibirDados();
    }
}
