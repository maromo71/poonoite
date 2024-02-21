public class TesteCarros {
    public static void main(String[] args) {
        //Ponto de execução
        Carro carro1, carro2;
        //Instaciar
        carro1 = new Carro();
        carro1.ano = 2010;
        carro1.cor = "Branco";
        carro1.modelo = "Ka";
        carro1.marca = "Ford";
        carro1.exibirDados();
        carro1.acelerar(60);
        carro1.exibirDados();
    }
}