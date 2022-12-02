import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> cartas = new ArrayList<>();
        ArrayList<Cartas> cartasBar = new ArrayList<>();

        Cartas c = new Cartas();
        Jogo j = new Jogo();

        c.iniciaBar(cartas, cartasBar);
        j.game(cartasBar, cartas);

        
    }

}