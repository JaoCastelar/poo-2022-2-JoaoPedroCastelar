import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        boolean i = true;

        while(i == true){
            System.out.println("Digite dois números: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x < y) {
                System.out.println("Cescente.");
            } 
            else if (x > y) {
                System.out.println("Decescente.");
            }
            else {
                i = false;
            }
        }
        sc.close();
    }
}
