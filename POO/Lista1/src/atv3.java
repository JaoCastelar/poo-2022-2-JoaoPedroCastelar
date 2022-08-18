import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        double media, idade1, idade2;

        System.out.println("Dados da primeira pessoa: ");
        System.out.printf("Nome: ");
        nome1 = sc.next();
        System.out.printf("Idade: ");
        idade1 = sc.nextInt();
        System.out.println("Dados da segunda pessoa: ");
        System.out.printf("Nome: ");
        nome2 = sc.next();
        System.out.printf("Idade: ");
        idade2 = sc.nextInt();

        media = (idade1 + idade2) / 2;
        System.out.printf("A idade média de %s e %s é: %.1f", nome1, nome2, media);
        sc.close();
    }
}
