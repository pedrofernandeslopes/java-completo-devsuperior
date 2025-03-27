package secao04.aula;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        // Mudando a localização
        Locale.setDefault(Locale.US);

        // Entrada de dados em Java
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();

        System.out.println("Você digitou: " + x);

        // Leitura de caractere
        char y;
        y = sc.next().charAt(0);

        System.out.println(y);

        sc.close();

    }
}
