package secao04.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        sc.close();
    }
}
