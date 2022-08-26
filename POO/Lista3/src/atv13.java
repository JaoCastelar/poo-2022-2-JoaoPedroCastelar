import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int p1 = 2;
        int p2 = 3;
        int p3 = 5;
        double x1, x2, x3, media;

        System.out.print("Quantos casos você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite três números: ");
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            media = ((x1*p1) + (x2*p2) + (x3*p3)) / (p1 + p2 + p3);

            System.out.printf("Média: %.1f", media);
        }

        sc.close();
    }
}
