public class ComputadorTeste {
    public static void main(String[] args) {
        Computador comp1  = new Computador();
        comp1.setMarca("hp");
        comp1.setModelo("Velho");
        comp1.setNumeroSerie(1234L);
        comp1.setPreco(500.00);
        comp1.setCor("Prata");
        comp1.imprimir();
        System.out.println();
        comp1.calcularValor(); //aplica a logica neste 30%
        comp1.imprimir();
        System.out.println();
        Computador comp2 = new Computador();
        comp2.setMarca("Ibm");
        comp2.setModelo("Novo");
        comp2.setNumeroSerie(3333L);
        comp2.setPreco(5000.00);
        comp2.setCor("Preta");
        comp2.imprimir();
        System.out.println();
        comp2.calcularValor();
        comp2.imprimir();
        double valor = 6000.0;
        System.out.println();
        if(comp2.alterarValor(valor)){
            System.out.println("Valor Alterado Com Sucesso");
        }else{
            System.out.println("Valor invalido para alteracao");
        }
        comp2.imprimir();
    }
}
