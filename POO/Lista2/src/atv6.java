import java.util.Scanner;


public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gli;

        System.out.printf("Digite a média da glicose: ");
        gli = sc.nextDouble();

        if (gli > 0 && gli <= 100) {
            System.out.println("Classificação: Normal");
        }
        else if (gli > 100 && gli <= 140) {
            System.out.println("Classificação: Elevado");
        }
        else if (gli > 140) {
            System.out.println("Classificação: Diabetes");
        }
        sc.close();
    }
}
