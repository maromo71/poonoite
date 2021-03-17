package br.edu.fatecmm.prjvetor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int vetorA[] = {1,2,3,4,5,6,7,8,9,10};
	    int vetorB[] = new int[10];

        System.arraycopy(vetorA, 3, vetorB, 6, 4);
	    for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
