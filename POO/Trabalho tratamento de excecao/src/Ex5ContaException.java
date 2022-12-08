public class Ex5ContaException extends Exception {

    public Ex5ContaException(String mensagem) throws Exception {
        Exception ex = new Exception(mensagem);
        throw ex;
    }

}