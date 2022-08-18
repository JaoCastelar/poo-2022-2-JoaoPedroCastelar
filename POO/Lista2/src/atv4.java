import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min;
        double val;

        System.out.printf("Digite a quantidade de minutos: ");
        min = sc.nextInt();

        if (min <= 100) {
            System.out.println("Valor a pagar: R$50,00");
        } else {
            val = ((min - 100) * 2) + 50;
            System.out.printf("Valor a pagar: R$%.2f", val);
        }
        sc.close();
    }
}
