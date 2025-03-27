package secao04.aula;

public class Aula02 {
    public static void main(String[] args) {
        // Exemplo 01
        int a, b;

        a = 5;
        b = 2 * 5;

        System.out.println(a);
        System.out.println(b);

        // Exemplo 02
        int c;
        double d;

        c = 5;
        d = 2 * c;

        System.out.println(c);
        System.out.println(d);

        // Exemplo 03
        double e, E, f, area;

        e = 6.0;
        E = 8.0;
        f = 5.0;

        area = (e + E) / 2.0 * f;

        System.out.println(area);

        // Exemplo 04
        int g, h;
        double resultado;

        g = 5;
        h = 2;

        //resultado = g / h;
        resultado = (double)g / h;

        System.out.println(resultado);

        // Exemplo 05 casting explicito
        double i;
        int j;

        i = 5.0;
        j = (int)i;

        System.out.println(j);
    }
}
