package EXCECOES;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int v1, v2, r;

            System.out.println("Digite um valor");
            v1 = sc.nextInt();
            System.out.println("Digite outro valor");
            v2 = sc.nextInt();

            r = v1 / v2;

            System.out.println("O resultado da divisao é: " + r);
            sc.close();
        }
        catch (ArithmeticException e) {
            System.out.println("Eitaaaaaa!! nao da pra fazer divisao por zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("Informe apenas valores inteiros");
        }
        catch (Exception e) {
            System.out.println("DEU TUDO ERRADO");
        }
    }
}
