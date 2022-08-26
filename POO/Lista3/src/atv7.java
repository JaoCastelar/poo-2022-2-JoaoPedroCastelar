import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, sum;
        boolean i = true;

        while (i == true) {
            System.out.printf("Digite um número inteiro: ");
            x = sc.nextInt();

            if (x != 0){
                if (x % 2 == 0) {
                    sum = x + (x+2) + (x+4) + (x+6) + (x+8);
                    System.out.printf("Soma: %d %n", sum);
                } else {
                    sum = (x+1) + (x+3) + (x+5) + (x+7) + (x+9);
                    System.out.printf("Soma: %d %n", sum);
                }
            }
            else{
                i = false;
            }
        }
        sc.close();
    }
}
