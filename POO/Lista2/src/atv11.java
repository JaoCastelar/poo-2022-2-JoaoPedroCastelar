import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal, nsal, aum;

        System.out.printf("Digite o salário da pessoa: ");
        sal = sc.nextDouble();

        if (sal > 0 && sal <= 1000) {
            aum = sal * 0.2;
            nsal = sal + aum;

            System.out.printf("Novo salário: %.2f %n", nsal);
            System.out.printf("Aumento: %.2f %n", aum);
            System.out.printf("Porcentagem: 20%%");
        }
        else if (sal > 1000 && sal <= 3000) {
            aum = sal * 0.15;
            nsal = sal + aum;

            System.out.printf("Novo salário: %.2f %n", nsal);
            System.out.printf("Aumento: %.2f %n", aum);
            System.out.printf("Porcentagem: 15%%");
        }
        else if (sal > 3000 && sal <= 8000) {
            aum = sal * 0.1;
            nsal = sal + aum;

            System.out.printf("Novo salário: %.2f %n", nsal);
            System.out.printf("Aumento: %.2f %n", aum);
            System.out.printf("Porcentagem: 10%%");
        }
        else if (sal > 8000) {
            aum = sal * 0.05;
            nsal = sal + aum;

            System.out.printf("Novo salário: %.2f %n", nsal);
            System.out.printf("Aumento: %.2f %n", aum);
            System.out.printf("Porcentagem: 5%%");
        }
        sc.close();
    }
}
