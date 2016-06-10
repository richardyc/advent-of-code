import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input1 = "ckczppom";
        Integer input2 = 0;
        String output = "aa41633a5396920fca763296809c66f6";
        while (output.toCharArray()[0] != '0' || output.toCharArray()[1] != '0' || output.toCharArray()[2] != '0' || output.toCharArray()[3] != '0' || output.toCharArray()[4] != '0' || output.toCharArray()[5] != '0') {
            input2++;
            output = getMD5(input1 + input2.toString());
        }
        System.out.println(output);
        System.out.println(input2.toString());

    }
}