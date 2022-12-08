import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("numero 1: ");
        int n1 = sc.nextInt();
        System.out.println("numero 2: ");
        int n2 = sc.nextInt();

        int div = n1/n2;
        
        System.out.println(div);

        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());

        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
