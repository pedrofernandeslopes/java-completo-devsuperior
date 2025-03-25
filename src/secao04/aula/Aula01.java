package secao04.aula;

import java.util.Locale;

public class Aula01 {
    public static void main(String[] args) {
        // Trocando a localidade do sistema
        Locale.setDefault(Locale.US);

        // Saída com quebra de linha
        System.out.println("Bom dia !");

        // Saída sem quebra de linha
        System.out.print("Olá mundo!");

        // Escrever conteúdo de uma variável
        int y = 32;
        System.out.println(y);

        // Escrever o conteúdo de uma variável com ponto flutuante
        double x = 10.453264536;
        System.out.println(x);

        // Utilizando o printf
        System.out.printf("%.2f\n", x);

        // Concatenar vários elementos em um mesmo comando de escrita
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros %n", x);

        // Exemplo de aula
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
    }
}
