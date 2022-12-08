import java.util.Scanner;

public class Ex3Teste {
    
    public static void main(String[] args) {
        
        Ex3Login l = new Ex3Login("Joao", "123");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        System.out.println("Insira a senha: ");
        String senha = sc.nextLine();

        l.fazerLogin(nome, senha);

        sc.close();
    }
}
