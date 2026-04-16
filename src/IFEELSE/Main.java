package IFEELSE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, me;
        System.out.println("Digite a n1:");
        n1 = sc.nextDouble();
        System.out.println("Digite a n2:");
        n2 = sc.nextDouble();
        me = (n1 + n2) / 2;

        if (me >= 6.0) {
            System.out.println("Sua media foi " + me + " e voce foi aprovado");
        } else {
            System.out.println("Sua media foi " + me + " e voce foi reprovado");
        }



        sc.close();
    }
}
