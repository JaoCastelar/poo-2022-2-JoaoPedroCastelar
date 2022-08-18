
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, qtd;
        double pre[] = {5, 3, 10, 8.9}, tot;

        System.out.printf("Código do produto: ");
        cod = sc.nextInt();
        System.out.printf("Quantidade comprada: ");
        qtd = sc.nextInt();

        if (cod == 1) {
            tot = qtd * pre[0];
            System.out.printf("Valor a pagar: R$ %.2f", tot);
        }
        else if (cod == 2) {
            tot = qtd * pre[1];
            System.out.printf("Valor a pagar: R$ %.2f", tot);
        }
        else if (cod == 3) {
            tot = qtd * pre[2];
            System.out.printf("Valor a pagar: R$ %.2f", tot);
        }
        else if (cod == 4) {
            tot = qtd * pre[3];
            System.out.printf("Valor a pagar: R$ %.2f", tot);
        }
        sc.close();
    }
}
