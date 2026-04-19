package ARRAYS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[]; // declaro o vetor
        notas = new double[5];

        for (int pos = 0; pos < 5; pos++) {
            System.out.println("Digite a nota do aluno " + pos);
            notas[pos] = sc.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        // Outra forma de imprimir com for
        for (double media : notas) {
            System.out.println(media);
        }


        sc.close();
    }
}
