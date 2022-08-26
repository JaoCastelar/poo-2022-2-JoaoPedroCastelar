import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, med;
        boolean ix = true, iy = true;

        System.out.printf("Digite a primeira nota: ");
        x = sc.nextDouble();
        if (x < 0 || x > 10){
            while (ix == true) {
                System.out.printf("Valor inválido! Tente novamente: ");
                x = sc.nextDouble();
                if(x >= 0 && x <= 10) {
                    ix = false;
                }
            }
        }

        System.out.printf("Digite a segunda nota: ");
        y = sc.nextDouble();
        if (y < 0 || y > 10){
            while (iy == true) {
                System.out.printf("Valor inválido! Tente novamente: ");
                y = sc.nextDouble();
                if(y >= 0 && y <= 10) {
                    iy = false;
                }
            }
        }

        med = (x + y) / 2;
        System.out.printf("Média: %.2f", med);
        
        sc.close();
    }
}
