package CriptoAnalizer.service;

public class CaesarCryptor implements Cryptor{
    @Override
    public String encript(String data, int key) {
        return cryptation(data, key);
    }

    @Override
    public String decript(String data, int key) {
        int newKey = - key;
        return cryptation(data, newKey);
    }

    private String cryptation (String text, int key) {
        char[] textInChars = text.toCharArray();
        char[] cryptedText = new char[textInChars.length];
        for(int i = 0; i < textInChars.length; i++) {
            int midl = (int)textInChars[i] + key;
            cryptedText[i] = (char)midl;
        }
        return new String(cryptedText);
    }
}
