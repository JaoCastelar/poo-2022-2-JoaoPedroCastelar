import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum = 0;

        System.out.println("Digite dois números:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < y) {
            for (int i = x; i < y; i++) {
                if (i % 2 == 1){
                    sum = sum + i;
                }
            }
            System.out.printf("Soma dos ímpares: %d", sum);
        } else {
            for (int i2 = y; i2 < x; i2++) {
                if (i2 % 2 == 1){
                    sum = sum + i2;
                    //System.out.printf("Soma dos ímpares: %d", sum);
                }
            }
            System.out.printf("Soma dos ímpares: %d", sum);
        }
        sc.close();
    }
}
