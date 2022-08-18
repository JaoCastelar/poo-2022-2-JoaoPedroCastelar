import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, nf;

        System.out.printf("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        nf = n1 + n2;

        System.out.printf("Nota final: %.1f %n", nf);

        if(nf < 60){
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
