public class Ex4TesteExcecao {
    public static void teste() throws Ex4MinhaExcecao {
        throw new Ex4MinhaExcecao();
    }

    public static void main(String[] args) {
        Ex4MinhaExcecao me = null;
        try {
            System.out.println("try ");

            teste();
        } catch (Ex4MinhaExcecao e) {
            System.out.println("catch ");
            me = e;
        }
        System.out.println("fim");
    }
}

// O código acima passa pelo try, depois o catch e por último o print da mensagem fim pois a função teste lança um erro proposital, fazendo o 
// progrma passar pela parte do catch.