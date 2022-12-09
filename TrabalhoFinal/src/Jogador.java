import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogador {
    
    protected Random rd = new Random();
    protected Scanner sc = new Scanner(System.in);

    protected char op = 's';
    protected int pont, n = 52;

    public Jogador() {
    }

    public Jogador(char op, int pont) {
        this.op = op;
        this.pont = pont;
    }

    public void jogadaJ(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){
        System.out.println("\nPontos atuais: " + pont + "\nDeseja puxar uma carta (s/n)?");
        op = sc.next().charAt(0);
        if (op == 's') {
            int ind = rd.nextInt(n);
            Cartas card = cartasBar.get(ind);

            System.out.println(card.toString());
            pont += card.calculaValor(cartas.get(ind));
            System.out.println("Pontos atuais(Jogador 1): " + pont + "\n");
            cartasBar.remove(ind);
        }
        n -= 1;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    
}
