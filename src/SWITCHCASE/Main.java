package SWITCHCASE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 4");
        int valor = sc.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Voce digitou 1");
                break;
            case 2:
                System.out.println("Voce digitou 2");
                break;
            case 3:
                System.out.println("Voce digitou 3");
                break;
            case 4:
                System.out.println("Voce digitou 4");
                break;
            default:
                System.out.println("Valor errado");
        }


        sc.close();
    }
}
