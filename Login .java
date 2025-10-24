public class Login {

  public static void main(String[] args) {

    String user = args[0];
    String pass = args[1];

    Credenciais c = Credenciais(user, pass);
    Criptografar crypto = Criptografar(c.getUser, getPass);
    Validacao v = Validacao(crypto.getUser, getPass);
  }

}

