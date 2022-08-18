import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prec, din, troc, tot, dif;
        int qtd;

        System.out.printf("Preço unitário do produto: ");
        prec = sc.nextInt();
        System.out.printf("Quantidade comprada: ");
        qtd = sc.nextInt();
        System.out.printf("Dinheiro recebido: ");
        din = sc.nextInt();

        tot = qtd * prec;

        if (din < tot) {
            dif = tot - din;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais.", dif);
        } else {
            troc = din - tot;
            System.out.printf("TROCO: R$%.2f", troc);
        }
        sc.close();
    }
}
