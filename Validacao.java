public class Validacao {
    private String UserAdm = "8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918";
    private String PassAdm = "A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3";
    private boolean auth;
    
    public Validacao(String User, String Pass) {
        if (User.equals(UserAdm) && Pass.equals(PassAdm)) {
            this.auth = true;
             System.out.println("Bem-vindo!");
        } else {
            this.auth = false;
            System.out.println("Erro");
        }
    }

    public boolean getAuth(){
        return this.auth;
    }

}