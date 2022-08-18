import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h;

        System.out.printf("Insira uma hora em formato inteiro: ");
        h = sc.nextInt();

        if (h < 12) {
            System.out.println("Bom dia!!");
        }
        else if (h >= 12 && h < 18) {
            System.out.println("Boa tarde!!");
        }
        else if (h >= 18 && h < 24) {
            System.out.println("Boa noite!!");
        }
        else {
            System.out.println("Hora inválida");
        }
        sc.close();
    }
}