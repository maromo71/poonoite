public class ContaTeste {
    public static void main(String[] args) {
        //1. Criar duas contas conta1 e conta2
        Conta conta1 = new Conta();
        conta1.numConta = 111;
        conta1.nomeCliente = "Maria";
        //Alteramos a taxa de movimentacao para todas as contas
        //Atributo estático pertence a todos os objetos do mesmo
        //tipo
        Conta.taxaMov = 0.0050;

        Conta conta2 = new Conta();
        conta2.numConta = 222;
        conta2.nomeCliente = "Jose";

        //Transacoes - depositando e retirando da conta1
        conta1.depositar(1000.0);
        conta1.sacar(100.0);
        conta1.emitirSaldo();

        //Transacoes - depositando e retirando da conta2
        conta2.depositar(1000);
        conta2.sacar(200);
        conta2.emitirSaldo();
    }
}
