import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro, diagonal;

        System.out.printf("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.printf("Altura do retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        System.out.printf("Área do retângulo: %.4f", area);
        perimetro = (base*2) + (altura*2);
        System.out.printf("Perímetro do retângulo: %.4f %n", perimetro);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.printf("Diagonal do retângulo: %.4f %n", diagonal);
        sc.close();
    }
}
