import model.Mes;

public class Gerenciar {
    static void main() {
        Mes mesAtual = Mes.marco;

        System.out.println(mesAtual);
        System.out.println("Lista de meses");
        for(Mes mes : Mes.values()){
            System.out.println(mes);
        }
    }
}
