public class Computador {
    private int idComputador;
    private String nomeComputador;
    private int qtdMemoria;
    private double valor;

    public Computador(){

    }
    public Computador(int idComputador, String nomeComputador, int qtdMemoria,
                      double valor){
        this.idComputador = idComputador;
        this.nomeComputador = nomeComputador;
        this.qtdMemoria = qtdMemoria;
        this.valor = valor;
    }


    //exemplo de atributo estatico
    private static double taxaDepreciacao = 0.1288;

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    public void setNomeComputador(String nomeComputador) {
        this.nomeComputador = nomeComputador;
    }

    public int getQtdMemoria() {
        return qtdMemoria;
    }

    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int atualizarPreco(Usuario usu, double preco){
        if(usu.getNivel()==2){
            valor = preco;
            return 1;
        }
        return 0;
    }

    public void listarDados(){
        System.out.println("Id do Comp: " + idComputador);
        System.out.println("Nome: " + nomeComputador);
        System.out.println("Qtd Mem: " + qtdMemoria);
        System.out.println("Valor: " + valor);
    }
}
