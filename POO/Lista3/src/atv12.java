import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um valor: ");
            x = sc.nextInt();
            if (x % 2 == 0 && x > 0) {
                System.out.println("Par positivo");
            } else if (x % 2 == 1 && x > 0) {
                System.out.println("Ímpar positivo");
            } else if (-1*x % 2 == 0 && x < 0) {
                System.out.println("Par negativo");
            } else if (-1*x % 2 == 1 && x < 0) {
                System.out.println("Ímpar negativo");
            } else if (x == 0) {
                System.out.println("Nulo");
            }
        }
        sc.close();
    }
}
