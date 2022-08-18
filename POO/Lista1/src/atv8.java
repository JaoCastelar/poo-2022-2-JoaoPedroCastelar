import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dist, gas, med;

        System.out.printf("Distância percorrida: ");
        dist = sc.nextDouble();
        System.out.printf("Combustível gasto: ");
        gas = sc.nextDouble();
        
        med = dist / gas;
        System.out.printf("Consumo médio: %.3f", med);
        sc.close();
    }
}
