import br.edu.fatecmm.estacionamento.model.Carro;

public class SistemaEstacionamento {
    public static void main(String[] args) {
        //Criar dois objetos do tipo Carro
        //Estacionar um deles
        //Parar o outro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuir valores aos atributos
        carro1.marca = "Fiat";
        carro1.modelo = "Pulse";
        carro1.placa = "ABC1234";
        carro1.ano = 2019;

        carro2.marca = "Hyundai";
        carro2.modelo = "HB20";
        carro2.placa = "DEF5678";
        carro2.ano = 2020;

        carro1.imprimir();
        System.out.println();
        carro2.imprimir();

        carro1.estacionar();
        carro2.retirar();
    }
}
