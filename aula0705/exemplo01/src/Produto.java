public class Produto implements Comparable<Produto> {
    private int id;
    private String descricao;
    private double valor;

    public Produto(){

    }

    public Produto(int id, String descricao, double valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Produto ) && ((Produto) o).id == this.id);
    }

    @Override
    public int hashCode() {
        return descricao.length();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id=").append(id);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Produto o) {
        if(this.id < o.id) return -1;
        if(this.id > o.id) return 1;
        return 0;
    }
}
