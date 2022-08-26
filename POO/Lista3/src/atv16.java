import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qtd, n, tot = 0, s = 0, c = 0, r = 0;
        double ps, pc, pr;
        Character t;

        System.out.print("Qauntos casos de teste serão digitados? ");
        n = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            qtd = sc.nextDouble();
            System.out.print("Tipo de cobaia: ");
            t = sc.next().charAt(0);

            if (t == 'c' || t == 'C') {
                c += qtd;
                tot += qtd;
            } else if (t == 's' || t == 'S') {
                s += qtd;
                tot += qtd;
            } else if (t == 'r' || t == 'R') {
                r += qtd;
                tot += qtd;
            } else {
                System.out.println("Opção inválida, repita a entrada.");
                i--;
            }
        }

        ps = (s * 100) / tot;
        pc = (c * 100) / tot;
        pr = (r * 100) / tot;

        System.out.println("Relatório final: ");
        System.out.printf("Total: %.0f %n", tot);
        System.out.printf("Total de coelhos: %.0f %n", c);
        System.out.printf("Total de ratos: %.0f %n", r);
        System.out.printf("Total de sapos: %.0f %n", s);
        System.out.printf("Percentual de coelhos: %.2f %n", pc);
        System.out.printf("Percentual de ratos: %.2f %n", pr);
        System.out.printf("Percentual de sapos: %.2f %n", ps);

        sc.close();
    }
}
