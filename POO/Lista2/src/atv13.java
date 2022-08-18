import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x, y;

        System.out.printf("Valor de X: ");
        x = sc.nextDouble();

        System.out.printf("Valor de Y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if (x == 0 && y > 0 || y < 0){
            System.out.println("Eixo Y");
        }
        else if (x > 0 || x < 0 && y == 0){
            System.out.println("Eixo X");
        }
        sc.close();
    }
}
