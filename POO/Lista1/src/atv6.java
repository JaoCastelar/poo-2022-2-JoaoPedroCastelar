import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double r, area;

        System.out.printf("Digite o valor do raio do círculo: ");
        r = sc.nextDouble();

        area = pi * Math.pow(r, 2);
        System.out.printf("Área: %.3f", area);
        sc.close();
    }
}
