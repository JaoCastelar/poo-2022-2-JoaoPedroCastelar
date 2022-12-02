import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    

    char man = 's', opJ = ' ';
    int cont = 0, n = 52, pont = 0, pont2 = 0;
    boolean controle1 = false;
    boolean controle2 = false;

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void jogador1(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){
        System.out.println("###############################Jogador 1###############################");
        System.out.println("Rodada: " + (cont+1) +"\nPontos atuais: " + pont + "\nDeseja puxar uma carta (s/n)?");
        opJ = sc.next().charAt(0);
        if (opJ == 's') {
            int ind = rd.nextInt(n);
            Cartas card = cartasBar.get(ind);

            System.out.println(card.toString());
            pont += card.calculaValor(cartas.get(ind));
            System.out.println("Pontos atuais(Jogador 1): " + pont + "\n");
            cartasBar.remove(ind);
            confereVit(pont, pont2, opJ, man);
        } else if(opJ == 'n') {
            confereVit(pont, pont2, opJ, man);
            controle1 = true;
        }
        n -= 1;
    }

    public void jogador2(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){
        System.out.println("###############################Jogador 2###############################");
        System.out.println("Rodada: " + (cont+1) +"\nPontos atuais: " + pont2 + "\nDeseja puxar uma carta (s/n)?");
        opJ = sc.next().charAt(0);
        if (opJ == 's') {
            int ind = rd.nextInt(n);
            Cartas card = cartasBar.get(ind);

            System.out.println(card.toString());
            pont2 += card.calculaValor(cartas.get(ind));
            System.out.println("Pontos atuais(Jogador 2): " + pont2 + "\n");
            cartasBar.remove(ind);
            confereVit(pont, pont2, opJ, man);
        } else if(opJ == 'n') {
            confereVit(pont, pont2, opJ, man);
            controle2 = true;
        }
        n -= 1;
    }

    public void maquina(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){
        if (pont2 >= 19 && pont2 <= 21 || pont2 > 21) {
            man = 'n';
            confereVit(pont, pont2, man, opJ);
        }else if(pont2 > pont && opJ == 'n'){
            man = 'n';
            confereVit(pont, pont2, opJ, man);
        }
        if (pont2 < 19 && man == 's') {
            int ind = rd.nextInt(n);
            Cartas card = cartasBar.get(ind);

            System.out.println(card.toString());
            pont2 += card.calculaValor(cartas.get(ind));
            System.out.println("Pontos atuais(Jogador 2): " + pont2);
            cartasBar.remove(ind);
            confereVit(pont, pont2, man, opJ);
        }
        n -= 1;
    }

    public void game(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){

        System.out.println("Quantidade de jogadores(1 ou 2): ");
        int op = sc.nextInt();

        if (op == 1) {
            do {
                if (cont % 2 == 0) {
                    if(controle1 == false){
                        jogador1(cartasBar, cartas);
                    }
                }else{
                    maquina(cartasBar, cartas);
                }
                cont += 1;
            } while (confereVit(pont, pont2, opJ, man) == false);
        } else if(op == 2) {
            do {
                if (cont % 2 == 0) {
                    if(controle1 == false){
                        jogador1(cartasBar, cartas);
                    }
                }else{
                    if(controle2 == false){
                        jogador2(cartasBar, cartas);
                    }
                }
                cont += 1;
            } while (confereVit(pont, pont2, opJ, man) == false);
        }else{
            System.out.println("Opção inválida!!");
        }
    }

    private static boolean confereVit(int pont, int pont2, char opJ, char man) {
        Boolean vit = false;

        if(pont == 21 || pont2 > 21){
            System.out.println("Jogador 1 venceu!!");
            vit = true;
        }else if(pont > pont2 && pont < 22 && opJ == 'n' && man == 'n'){
            System.out.println("Jogador 1 venceu!!");
            vit = true;
        }else if(pont2 == 21 || pont > 21){
            System.out.println("Jogador 2 venceu!!");
            vit = true;
        }else if(pont < pont2 && pont2 < 22 && opJ == 'n' && man == 'n'){
            System.out.println("Jogador 2 venceu!!");
            vit = true;
        }else if(pont == pont2 && opJ == 'n' && man == 'n'){
            System.out.println("Empate!!");
            vit = true;
        }

        return vit;
    }
}
