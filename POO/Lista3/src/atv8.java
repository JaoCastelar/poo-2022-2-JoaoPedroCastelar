import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, res;

        System.out.printf("Deseja a tabuada para qual valor? ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.printf("%d x %d = %d %n", n, i, res);
        }
        sc.close();
    }
}
