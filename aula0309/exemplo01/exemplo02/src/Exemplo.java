public class Exemplo {
    public static void main(String[] args) {
        Dias dia;
        dia = Dias.segunda;
        System.out.println(dia);
        //Verificar os dias
        System.out.println();
        for(Dias d: Dias.values()){
            System.out.println(d);
        }

    }
}
