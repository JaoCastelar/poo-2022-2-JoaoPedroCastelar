import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, g = 0 , d = 0, op;
        boolean i = true;

        while (i == true) {
            System.out.printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            op = sc.nextInt();
            if (op == 1) {
                a = a + 1;
            }
            else if (op == 2) {
                g = g + 1;
            }
            else if (op == 3) {
                d = d + 1;
            }
            else if (op == 4) {
                System.out.println("Muito obrigado");
                System.out.printf("Álcool: %d", a);
                System.out.printf("%nGasolina: %d", g);
                System.out.printf("%nDiesel: %d", d);
                i = false;
            }
        }
        sc.close();
    }
}
