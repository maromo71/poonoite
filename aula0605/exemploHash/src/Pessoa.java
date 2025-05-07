public class Pessoa {
    //Atributos privados
    private int id;
    private String nome;
    private String curso;

    //Construtor padrão
    public Pessoa(int id, String nome, String curso){
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Equals e Hashcode

    @Override
    public int hashCode() {
        return nome.length(); //Lógica de agrupamento (hash igual qtd de caracteres do nome)
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id == pessoa.id;
    }
}
