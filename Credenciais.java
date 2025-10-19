public class Credenciais {
    private String user;
    private String pass;

    public Credenciais(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    // Getters
    
    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    // Setters

    public void settUser(String user) {
        this.user = user;
    }

    public void settPass(String pass) {
        this.pass = pass;
    }
}