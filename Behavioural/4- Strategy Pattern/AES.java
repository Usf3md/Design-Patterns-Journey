public class AES implements Encryption {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return "EncryptedMessage";
    }

}
