import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valH, horasT, pag;

        System.out.printf("Nome: ");
        nome = sc.next();
        System.out.printf("Valor por hora: ");
        valH = sc.nextDouble();
        System.out.printf("Horas trabalhadas: ");
        horasT = sc.nextDouble();

        pag = valH * horasT;
        System.out.printf("O pagamento para %s deve ser %.2f", nome, pag);
        sc.close();
    }
}
