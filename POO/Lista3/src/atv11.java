import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, d = 0, f = 0;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um valor: ");
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                d = d + 1;
            } else {
                f = f + 1;
            }
        }
        System.out.println("Dentro: " + d);
        System.out.println("Fora: " + f);

        sc.close();
    }
}
