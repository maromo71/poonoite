public class Exemplo01 {
    public static void main(String[] args) {
        //Definir vetor com valores inicializados
        int[] vetor = {3, 5, 7, 9, 11, 13};
        //Imprimir esse vetor.
        System.out.println("Impressao com for tradicional");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Impressao com for each");
        for(int num : vetor){
            System.out.println(num);
        }
    }
}
