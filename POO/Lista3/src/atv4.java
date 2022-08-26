import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x, y;
        boolean i = true;

        while(i == true){
            System.out.println("Valor de X e Y: ");
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (x > 0 && y > 0){
                System.out.println("Quadrante Q1");
            }
            else if (x < 0 && y > 0){
                System.out.println("Quadrante Q2");
            }
            else if (x < 0 && y < 0){
                System.out.println("Quadrante Q3");
            }
            else if (x > 0 && y < 0){
                System.out.println("Quadrante Q4");
            }
            else if (x == 0 || y == 0){
                i = false;
            }
        }
        sc.close();
    }
}