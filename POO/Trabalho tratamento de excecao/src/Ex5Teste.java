import java.util.Scanner;

public class Ex5Teste {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Ex5ContaBancaria cb = new Ex5ContaBancaria(500, 500);

        System.out.println("Informe o valor a ser sacado:");
        double valor = sc.nextDouble();
        cb.sacar(valor);

        System.out.println("Informe o valor a ser depositado:");
        valor = sc.nextDouble();
        cb.depositar(valor);


        sc.close();
    }
}
