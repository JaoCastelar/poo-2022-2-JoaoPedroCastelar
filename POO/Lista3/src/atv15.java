import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, f = 1;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.printf("Fatorial: %d", f);

        sc.close();
    }
}
