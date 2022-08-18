import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi, hf, temp;

        System.out.printf("Hora inical: ");
        hi = sc.nextInt();

        System.out.printf("Hora final: ");
        hf = sc.nextInt();

        if (hi > hf) {
            temp = (24 - hi) + hf;
            System.out.printf("O jogo durou %d horas", temp);
        } 
        else if (hi == hf) {
            System.out.println("O jogo durou 24 horas");
        }
        else if (hi < hf) {
            temp = hf - hi;
            System.out.printf("O jogo durou %d horas", temp);
        }
        sc.close();
    }
}
