import model.Boleto;
import model.Mes;

public class Teste {
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        boleto.num = 123;
        boleto.valor = 3000.00;
        boleto.mesVencimento = Mes.out;
        boleto.imprimir();
        //imprimir os meses do ano
        for(Mes mes : Mes.values()){
            System.out.println("Mes: " + mes);
        }

    }
}
