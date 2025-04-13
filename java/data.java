import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESExample {

    // Encrypt text using AES
    public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt text using AES
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decrypted = cipher.doFinal(decodedBytes);
        return new String(decrypted);
    }

    public static void main(String[] args) throws Exception {
        // Step 1: Generate AES key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // You can use 192 or 256 bits if supported
        SecretKey secretKey = keyGen.generateKey();

        String originalText = "Hello Arun, this is secret!";
        System.out.println("Original: " + originalText);

        // Step 2: Encrypt
        String encrypted = encrypt(originalText, secretKey);
        System.out.println("Encrypted: " + encrypted);

        // Step 3: Decrypt
        String decrypted = decrypt(encrypted, secretKey);
        System.out.println("Decrypted: " + decrypted);
    }
}
