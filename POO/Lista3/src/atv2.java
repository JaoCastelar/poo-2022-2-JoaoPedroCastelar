import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, som = 0, med;
        int i = 0;
        boolean y = true;

        System.out.println("Digite as idades: ");
        while (y == true){
            x = sc.nextDouble();
            if(i == 0 && x < 0){
                System.out.println("Impossível calcular");
                y = false;
            }
            else if (i > 0 && x < 0){
                med = som / i;
                System.out.printf("Média: %.2f", med);
                y = false;
            }
            som = som + x;
            i++;
        }
        sc.close();
    }
}
