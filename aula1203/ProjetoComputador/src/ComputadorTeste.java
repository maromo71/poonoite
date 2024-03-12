public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.preco = 500;
        computador1.modelo = "Velho";
        computador1.marca = "hp";
        computador1.numeroSerie = 123;
        computador1.cor = "Prata";
        computador1.imprimir();
        System.out.println();
        computador1.calcularValor();
        computador1.imprimir();
        System.out.println();
        Computador computador2 = new Computador();
        computador2.marca = "IbM";
        computador2.modelo = "Usado";
        computador2.preco = 1000;
        computador2.numeroSerie = 234;
        computador2.cor = "Branca";
        computador2.imprimir();
        System.out.println();
        computador2.calcularValor();
        computador2.imprimir();
        System.out.println();
        if(computador2.alterarValor(1800)){
            System.out.println("Valor Alterado");
        } else{
            System.out.println("Valor Não Alterado");
        }
        System.out.println();
        computador2.imprimir();


    }
}
