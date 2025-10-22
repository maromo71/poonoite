public class Produto {
    //item (a) da prova
    private int codigo;
    private String nome;
    private String descricao;
    private double precoVenda;
    private int quantidadeEstoque;


    //3.2 Construtor padrão
    public Produto(){

    }
    //3.2 Sobrecarga
    public Produto(int codigo, String nome, String descricao, double precoVenda){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = 0;
        this.precoVenda = precoVenda;
    }
    //item (b) da prova
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //item (c) da prova
    public boolean removerEstoque(int quantidade){
        if(quantidade <= quantidadeEstoque){
            quantidadeEstoque-=quantidade;
            return true;
        }
        return false;
    }
}
