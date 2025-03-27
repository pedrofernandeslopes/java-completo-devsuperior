package secao04.aula;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        //Ler um texto até a quebra de linha
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Quebra de linha pendente
        int x;
        String n1, n2, n3;

        x = sc.nextInt();
        sc.nextLine(); // Limpar o buffer de leitura
        n1 = sc.nextLine();
        n2 = sc.nextLine();
        n3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
    }
}
