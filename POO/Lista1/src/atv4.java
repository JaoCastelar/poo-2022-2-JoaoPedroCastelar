import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, result;

    System.out.printf("Digite o valor de x: ");
    x = sc.nextInt();
    System.out.printf("Digite o valor de y: ");
    y = sc.nextInt();

    result = x + y;
    System.out.printf("SOMA: %d", result);
    sc.close();
    }
}
