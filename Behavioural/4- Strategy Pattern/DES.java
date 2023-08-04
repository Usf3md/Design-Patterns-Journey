public class DES implements Encryption {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return "EncryptedMessage";
    }

}
