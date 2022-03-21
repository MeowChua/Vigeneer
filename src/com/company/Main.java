package com.company;

public class Main {

    public static void main(String[] args) {

            String key = "VIGENERECIPHER";
            String message = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
            String encryptedMsg = Vigenere.encrypt(message, key);
            System.out.println("String: " + message);
            System.out.println("Encrypted message: " + encryptedMsg);
            System.out.println("Decrypted message: " + Vigenere.decrypt(encryptedMsg, key));

    }
}
