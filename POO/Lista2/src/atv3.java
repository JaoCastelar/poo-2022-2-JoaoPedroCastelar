import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, m;

        System.out.printf("Primeiro valor: ");
        n1 = sc.nextInt();
        System.out.printf("Segundo valor: ");
        n2 = sc.nextInt();
        System.out.printf("Terceiro valor: ");
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3 || n1 == n2 || n1 == n3) {
            m = n1;
            System.out.printf("MENOR: %d", m);
        } 
        else if (n2 < n1 && n2 < n3 || n2 == n1 || n2 == n3) {
            m = n2;
            System.out.printf("MENOR: %d", m);
        }
        else if (n3 < n1 && n3 < n2 || n3 == n2 || n1 == n3) {
            m = n3;
            System.out.printf("MENOR: %d", m);
        }
        sc.close(); 
    }
}
