import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, c, valor, area, preco;

        System.out.printf("Digite a largura do terreno: ");
        l = sc.nextDouble();
        System.out.printf("Digite o comprimento do terreno: ");
        c = sc.nextDouble();
        System.out.printf("Digite o valor do m²: ");
        valor = sc.nextDouble();
        area = l * c;
        System.out.printf("Área do terreno: %.2f %n", area);
        preco = area * valor;
        System.out.printf("Preço do terreno: %.2f", preco);
        sc.close();
    }
}
