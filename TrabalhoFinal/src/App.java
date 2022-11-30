import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> cartas = new ArrayList<>();
        ArrayList<Cartas> cartasBar = new ArrayList<>();

        Random rd = new Random();

        Scanner sc = new Scanner(System.in);

        boolean vit = false;
        int pontJ1 = 0;
        int pont = 0;
        int pont2 = 0;
        int n = 52;
        int cont = 0;
        char op1 = ' ';
        char man = ' ';

        System.out.println("Quantidade de jogadores(1 ou 2): ");
        int op = sc.nextInt();

        if (op == 1) {
            iniciaBar(cartas, cartasBar);
            game1(cartas, cartasBar, rd, sc, pont, pont2, vit, cont, op1, man, n);
        }else if(op == 2){
            iniciaBar(cartas, cartasBar);
            game2(cartas, cartasBar, rd, sc, vit, cont, op1, man, pontJ1, n);
        }else{
            System.out.println("Opção inválida");
        }

        sc.close();
    }



    private static void game1(ArrayList<String> cartas, ArrayList<Cartas> cartasBar, Random rd, Scanner sc,
            int pont, int pont2, boolean vit, int cont, char op1,char man, int n) {
                man = 's';
        do {
            if (cont % 2 == 0) {
                System.out.println("Rodada: " + (cont+1) +" Jogador 1\nDeseja puxar uma carta (s/n)?");
                op1 = sc.next().charAt(0);
                if (op1 == 's') {
                    int ind = rd.nextInt(n);
                    Cartas card = cartasBar.get(ind);

                    System.out.println(card.toString());
                    pont += card.calculaValor(cartas.get(ind));
                    System.out.println("Pontos atuais(Jogador 1): " + pont + "\n");
                    cartasBar.remove(ind);
                    confereVit(pont, pont2, op1, man);
                } else if(op1 == 'n') {
                    confereVit(pont, pont2, op1, man);
                }
                n -= 1;
            }else{
                if (pont2 >= 19 && pont2 <= 21 || pont2 > 21) {
                    man = 'n';
                    confereVit(pont, pont2, man, op1);
                }else if(pont2 > pont && op1 == 'n'){
                    man = 'n';
                    confereVit(pont, pont2, op1, man);
                }
                if (pont2 < 19 && man == 's') {
                    int ind = rd.nextInt(n);
                    Cartas card = cartasBar.get(ind);
        
                    System.out.println(card.toString());
                    pont2 += card.calculaValor(cartas.get(ind));
                    System.out.println("Pontos atuais(Jogador 2): " + pont2);
                    cartasBar.remove(ind);
                    confereVit(pont, pont2, man, op1);
                }
                n -= 1;
            }
            cont += 1;
        } while (confereVit(pont, pont2, op1, man) == false);
    }

    private static void game2(ArrayList<String> cartas, ArrayList<Cartas> cartasBar, Random rd, Scanner sc,
            boolean vit, int cont, char op1, char man, int pontJ1, int n) {
                int pont = 0;
                int pont2 = 0;
        do {
            if (cont % 2 == 0) {
                System.out.println("Rodada: " + (cont) +" Jogador 1\nDeseja puxar uma carta (s/n)?");
                op1 = sc.next().charAt(0);
                if (op1 == 's') {
                    int ind = rd.nextInt(n);
                    Cartas card = cartasBar.get(ind);

                    System.out.println(card.toString());
                    pont += card.calculaValor(cartas.get(ind));
                    System.out.println("Pontos atuais(Jogador 1): " + pont + "\n");
                    cartasBar.remove(ind);
                    confereVit(pont, pont2, op1, man);
                } else if(op1 == 'n') {
                    confereVit(pont, pont2, op1, man);
                }
                n -= 1;
            }else{
                System.out.println("Rodada: " + (cont) +" Jogador 2\nDeseja puxar uma carta (s/n)?");
                man = sc.next().charAt(0);
                if (man == 's') {
                    int ind = rd.nextInt(n);
                    Cartas card = cartasBar.get(ind);

                    System.out.println(card.toString());
                    pont2 += card.calculaValor(cartas.get(ind));
                    System.out.println("Pontos atuais(Jogador 2): " + pont2 + "\n");
                    cartasBar.remove(ind);
                    confereVit(pont, pont2, op1, man);
                } else if(man == 'n') {
                    confereVit(pont, pont2, op1, man);
                }
                n -= 1;
            }
            cont += 1;
        } while (confereVit(pont, pont2, op1, man) == false);
    }

    private static boolean confereVit(int pont, int pont2, char op1, char man) {
        Boolean vit = false;

        if(pont == 21 || pont2 > 21){
            System.out.println("Jogador 1 venceu!!");
            vit = true;
        }else if(pont > pont2 && pont < 22 && op1 == 'n' && man == 'n'){
            System.out.println("Jogador 1 venceu!!");
            vit = true;
        }else if(pont2 == 21 || pont > 21){
            System.out.println("Jogador 2 venceu!!");
            vit = true;
        }else if(pont < pont2 && pont2 < 22 && op1 == 'n' && man == 'n'){
            System.out.println("Jogador 2 venceu!!");
            vit = true;
        }
        return vit;
    }

    private static void iniciaBar(ArrayList<String> cartas, ArrayList<Cartas> cartasBar) {

        Cartas c;

        cartas.add("p1");
        cartas.add("c1");
        cartas.add("e1");
        cartas.add("o1");

        cartas.add("p2");
        cartas.add("c2");
        cartas.add("e2");
        cartas.add("o2");

        cartas.add("p3");
        cartas.add("c3");
        cartas.add("e3");
        cartas.add("o3");

        cartas.add("p4");
        cartas.add("c4");
        cartas.add("e4");
        cartas.add("o4");

        cartas.add("p5");
        cartas.add("c5");
        cartas.add("e5");
        cartas.add("o5");

        cartas.add("p6");
        cartas.add("c6");
        cartas.add("e6");
        cartas.add("o6");

        cartas.add("p7");
        cartas.add("c7");
        cartas.add("e7");
        cartas.add("o7");

        cartas.add("p8");
        cartas.add("c8");
        cartas.add("e8");
        cartas.add("o8");

        cartas.add("p9");
        cartas.add("c9");
        cartas.add("e9");
        cartas.add("o9");

        cartas.add("p10");
        cartas.add("c10");
        cartas.add("e10");
        cartas.add("o10");

        cartas.add("pv");
        cartas.add("cv");
        cartas.add("ev");
        cartas.add("ov");
        cartas.add("pd");
        cartas.add("cd");
        cartas.add("ed");
        cartas.add("od");
        cartas.add("pr");
        cartas.add("cr");
        cartas.add("er");
        cartas.add("or");

        for (int i = 0; i < cartas.size(); i++) {
            c = new Cartas(cartas.get(i));
            cartasBar.add(c);
        }
    }
}
