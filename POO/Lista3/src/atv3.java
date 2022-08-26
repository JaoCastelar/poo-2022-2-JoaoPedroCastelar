import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2002, y;
        boolean i = true;

        System.out.printf("Digite a senha: ");
        y = sc.nextInt();
        if (y != x){
            while (i == true) {
                System.out.printf("Senha inválida! Tente novamente: ");
                y = sc.nextInt();
                if (y == x) {
                    System.out.println("Acesso permitido.");
                    i = false;
                }
            }
        }
        else{
            System.out.println("Acesso permitido.");
        }
        sc.close();
    }
}
