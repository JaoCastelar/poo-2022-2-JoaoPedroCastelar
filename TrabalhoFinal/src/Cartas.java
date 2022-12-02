import java.util.ArrayList;

public class Cartas {

    private String nome;
    private ArrayList<Cartas> cartasBar;
    private ArrayList<String> cartas;

    public int calculaValor(String nome){
        int valor = 0;
        if (nome == "p1" || nome == "c1" || nome == "e1" || nome == "o1") {
            valor += 1;
        }else if (nome == "p2" || nome == "c2" || nome == "e2" || nome == "o2") {
            valor += 2;
        }else if (nome == "p3" || nome == "c3" || nome == "e3" || nome == "o3") {
            valor += 3;
        }else if (nome == "p4" || nome == "c4" || nome == "e4" || nome == "o4") {
            valor += 4;
        }else if (nome == "p5" || nome == "c5" || nome == "e5" || nome == "o5") {
            valor += 5;
        }else if (nome == "p6" || nome == "c6" || nome == "e6" || nome == "o6") {
            valor += 6;
        }else if (nome == "p7" || nome == "c7" || nome == "e7" || nome == "o7") {
            valor += 7;
        }else if (nome == "p8" || nome == "c8" || nome == "e8" || nome == "o8") {
            valor += 8;
        }else if (nome == "p9" || nome == "c9" || nome == "e9" || nome == "o9") {
            valor += 9;
        }else if (nome == "p10" || nome == "c10" || nome == "e10" || nome == "o10" 
        || nome == "pv" || nome == "cv" || nome == "ev" || nome == "ov" 
        || nome == "pd" || nome == "cd" || nome == "ed" || nome == "od" 
        || nome == "pr" || nome == "cr" || nome == "er" || nome == "or") {
            valor += 10;
        }

        return valor;
    }

    public void iniciaBar(ArrayList<String> cartas, ArrayList<Cartas> cartasBar) {

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

    public Cartas() {
    }

    public Cartas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cartas> getCartasBar() {
        return cartasBar;
    }

    public void setCartasBar(ArrayList<Cartas> cartasBar) {
        this.cartasBar = cartasBar;
    }

    public ArrayList<String> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<String> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Carta: " + nome;
    }

    
}