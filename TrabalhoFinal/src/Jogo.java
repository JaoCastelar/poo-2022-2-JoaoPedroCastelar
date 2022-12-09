import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    
    private int cont = 0, n = 52;

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void game(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){

        System.out.println("Quantidade de jogadores(1 ou 2): ");
        int op = sc.nextInt();

        if (op == 1) {

            Jogador j = new Jogador();
            Maquina m = new Maquina();

            do {
                if (cont % 2 == 0) {
                    if(j.getOp() == 's'){
                        System.out.println("###############################Jogador 1###############################");
                        j.jogadaJ(cartasBar, cartas);
                        confereVit(j.getPont(), m.getPont(), j.getOp(), m.getOp());
                    }
                }else{
                    m.maquinaM(cartasBar, cartas);
                    confereVit(j.getPont(), m.getPont(), j.getOp(), m.getOp());
                }
                cont += 1;
            } while (confereVit(j.getPont(), m.getPont(), j.getOp(), m.getOp()) == false);
        } else if(op == 2) {

            Jogador j1 = new Jogador();
            Jogador j2 = new Jogador();

            do {
                if (cont % 2 == 0) {
                    if(j1.getOp() == 's'){
                        System.out.println("###############################Jogador 1###############################");
                        j1.jogadaJ(cartasBar, cartas);
                        confereVit(j1.getPont(), j2.getPont(), j1.getOp(), j2.getOp());
                    }
                }else{
                    if(j2.getOp() == 's'){
                        System.out.println("###############################Jogador 2###############################");
                        j2.jogadaJ(cartasBar, cartas);
                        confereVit(j1.getPont(), j2.getPont(), j1.getOp(), j2.getOp());
                    }
                }
                cont += 1;
            } while (confereVit(j1.getPont(), j2.getPont(), j1.getOp(), j2.getOp()) == false);
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

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}