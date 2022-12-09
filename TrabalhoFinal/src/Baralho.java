import java.util.ArrayList;

public class Baralho {
    
    protected Baralho nome;
    protected ArrayList<Baralho> cartasBar = new ArrayList<>(52);

    public Baralho() {
    }

    public Baralho(Baralho string) {
        this.nome = string;
    }

    public Baralho(String string) {
    }

    public void iniciaBar(ArrayList<String> cartas, ArrayList<Baralho> cartasBar) {

        Baralho b;

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
            b = new Baralho(cartas.get(i));
            cartasBar.add(b);
        }
    }

    public Baralho getNome() {
        return nome;
    }

    public void setNome(Baralho nome) {
        this.nome = nome;
    }

    public ArrayList<Baralho> getCartasBar() {
        return cartasBar;
    }

    public void setCartasBar(ArrayList<Baralho> cartasBar) {
        this.cartasBar = cartasBar;
    }

    @Override
    public String toString() {
        return "Carta: " + nome;
    }

    
}
