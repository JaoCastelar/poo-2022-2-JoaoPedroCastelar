public class Ex3Login {
    

    private String usuario;
    private String senha;
    
    public Ex3Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha){
        boolean log = false;
        try{
        if(!usuario.equals(this.usuario) || !senha.equals(this.senha)) {
            throw new Exception("Usuário incorreto");
        }else{
            System.out.println("Login efetuado com sucesso");
            log = true;
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return log;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
