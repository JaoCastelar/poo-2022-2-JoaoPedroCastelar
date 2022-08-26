import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, x, y, d;

        System.out.print("Quantos casos você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o numerador: ");
            x = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            y = sc.nextInt();
            if (y == 0) {
                System.out.println("Divisão impossível.");
            }
            else {
                d = x / y;

                System.out.printf("Divisão: %.2f %n", d);
            }
        }

        sc.close();
    }
}
