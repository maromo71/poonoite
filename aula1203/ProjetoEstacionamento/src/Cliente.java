import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    //Associação
    private List<Carro> listaDeCarros;

    //Método construtor
    public Cliente(){
        listaDeCarros = new ArrayList<>();
    }

    //Métodos getters and setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getListaDeCarros() {
        return listaDeCarros;
    }

    public void setListaDeCarros(List<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }

    //Método personalizado
    public void adicionarCarro(Carro carro){
        listaDeCarros.add(carro);
    }

    //para mostrar todos os dados do cliente
    public void exibirDados(){
        System.out.println("Dados do Cliente: ");
        System.out.println("nome = " + nome);
        System.out.println("telefone = " + telefone);
        System.out.println("email = " + email);
        System.out.println("Carros deste cliente: ");
        for(Carro carro : listaDeCarros){
            //chamar o exibirDadosDoCarro
            carro.exibirDados(); //Dados do carro
        }
        System.out.println();
    }
}
