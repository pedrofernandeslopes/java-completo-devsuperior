package secao04.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
}
