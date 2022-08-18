import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec, h, m, s;

        System.out.printf("Digite a duração em segundos: ");
        sec = sc.nextInt();

        h = sec / 3600;
        m = (sec % 3600) / 60;
        s = sec % 60;

        System.out.printf("%d:%d:%d", h, m ,s);
        sc.close();
    }
}
