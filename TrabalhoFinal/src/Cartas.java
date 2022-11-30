public class Cartas {

    private String nome;

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

    @Override
    public String toString() {
        return "Carta: " + nome;
    }

    
}