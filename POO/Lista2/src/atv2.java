import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2, delta;

        Locale.setDefault(Locale.US);

        System.out.println("Digite um valor para a, b e c (respectivamente): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1: %.2f %nx2: %.2f", x1, x2);
        }
        sc.close();
    }
}
