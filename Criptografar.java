import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografar {
    private String User;
    private String Pass;

    public Criptografar(String User, String Pass){
       MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
       byte user[] = algorithm.digest(User.getBytes("UTF-8"));
       byte pass[] = algorithm.digest(Pass.getBytes("UTF-8"));
       this.User = getString(user[])
       this.Pass = getString(pass[])
    }

    private void getString(byte[] cred){
       StringBuilder hexString = new StringBuilder();
       for (byte b : n) {
         hexString.append(String.format("%02X", 0xFF & b));
       }
       String senhahex = hexString.toString();

       System.out.println(senhahex);
    }

    public String getUser() {
        return User;
    }

    public String getPass() {
        return Pass
    }
}