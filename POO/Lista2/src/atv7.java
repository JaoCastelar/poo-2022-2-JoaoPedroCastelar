import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1, d2, d3, m;

        System.out.println("Digite as três distâncias: ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();

        if (d1 > d2 && d1 > d3 || d1 == d2 || d1 == d3) {
            m = d1;
            System.out.printf("MAIOR: %.2f", m);
        } 
        else if (d2 > d1 && d2 > d3 || d2 == d1 || d2 == d3) {
            m = d2;
            System.out.printf("MAIOR: %.2f", m);
        }
        else if (d3 > d1 && d3 > d2 || d3 == d2 || d1 == d3) {
            m = d3;
            System.out.printf("MAIOR: %.2f", m);
        }
        sc.close(); 
    }
}
