import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int vet[] = new int[10];
        int op = 1;
        int cont = 0;

        while(op != 0){
            try {

                System.out.println("Insira o número");
                op = sc.nextInt();
                vet[cont] = op;
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }
            cont ++;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }
}
