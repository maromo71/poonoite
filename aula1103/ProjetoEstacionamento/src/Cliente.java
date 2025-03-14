import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Atributos
    private int codigo;
    private String nomeCliente;
    private String email;
    //Associacao
    private List<Carro> carros = new ArrayList<Carro>();

    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //Imprimir
    public void imprimir(){
        System.out.println("Dados da pessoa");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Email: " + email);
        if(carros.isEmpty()){
            System.out.println("Cliente não possui carros cadastrados");
        }else{
            System.out.println("Lista de Carros");
            for(Carro carro : carros){
                carro.imprimir();
            }
        }
    }

    //Método para adicionar um carro ao cliente
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
}
