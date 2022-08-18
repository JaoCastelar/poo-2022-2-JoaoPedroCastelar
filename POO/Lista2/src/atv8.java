import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char temp;
        double c, f, conv;

        System.out.printf("Você vai digitar a temperatura em qual escala (C/F)? ");
        temp = sc.next().charAt(0);

        if (temp == 'F') {
            System.out.printf("Digite a temperatura em Fahrenheit: ");
            f = sc.nextDouble();

            conv = (f - 32) / 1.8;
            System.out.printf("%n Temperatura equivalente em Celsius: %.2f", conv);
        }
        else if (temp == 'C'){
            System.out.printf("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();

            conv = (1.8 * c) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", conv);
        }
        else {
            System.out.println("Conversão inválida");
        }
        sc.close();
    }
}
