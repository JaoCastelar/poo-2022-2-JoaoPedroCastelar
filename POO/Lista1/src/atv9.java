import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, res;

        System.out.printf("Digite a medida A: ");
        a = sc.nextDouble();
        System.out.printf("Digite a medida B: ");
        b = sc.nextDouble();
        System.out.printf("Digite a medida C: ");
        c = sc.nextDouble();

        res = a * a;
        System.out.printf("Área do quadrado: %.4f %n", res);

        res = (a * b) / 2;
        System.out.printf("Área do triângulo: %.4f %n", res);

        res = (a + b) * c / 2;
        System.out.printf("Área do trapézio: %.4f %n", res);

        sc.close();
    }
}
