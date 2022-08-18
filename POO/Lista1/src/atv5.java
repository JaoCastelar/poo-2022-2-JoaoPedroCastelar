import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, qtd, din, troco;

    System.out.printf("Preço unitário do produto: ");
    preco = sc.nextDouble();
    System.out.printf("Quantidade comprada: ");
    qtd = sc.nextDouble();
    System.out.printf("Dinheiro recebido: ");
    din = sc.nextDouble();
    
    troco = din - (preco * qtd);
    System.out.printf("Troco: %.2f", troco);

    sc.close();
    }
}
