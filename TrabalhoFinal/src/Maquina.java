import java.util.ArrayList;

public class Maquina extends Jogador{
   

    public Maquina() {
        super();
    }



    public void maquinaM(ArrayList<Cartas> cartasBar, ArrayList<String> cartas){
        if (this.pont >= 19 && this.pont <= 21 || this.pont > 21) {
            this.op = 'n';
        }else if(this.pont > super.pont && super.op == 'n'){
            this.op = 'n';
        }
        if (this.pont < 19 && this.op == 's') {
            try {
                System.out.println("###############################Jogador 2###############################");
                int ind = rd.nextInt(n);
                Cartas card = cartasBar.get(ind);

                System.out.println(card.toString());
                pont += card.calculaValor(cartas.get(ind));
                System.out.println("Pontos atuais(Jogador 2): " + pont);
                cartasBar.remove(ind);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        n -= 1;
    }

    
}
