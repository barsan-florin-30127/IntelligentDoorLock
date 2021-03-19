package isp.lab8.Exercise1;

import java.util.Scanner;

/**
 * Main class.
 * Contains objects of the two classes that encrypt/decrypt data
 * Based on user's choices,it does the desired process
 */
public class Main {
    public static void main(String[] args) {
        Encrypt encrypter = new Encrypt();
        Decrypt decrypter = new Decrypt();
        Scanner scan = new Scanner(System.in);
        String encExtension = ".enc";
        String decExtension = ".dec";
        System.out.println("Choose the operation you want to make:encrypt/decrypt");
        String firstChoice = scan.nextLine();
        switch (firstChoice) {
            case "encrypt": {
                System.out.println("Introduce the name of the file you want to encrypt(with extension):");
                String textFile = scan.nextLine();
                System.out.println("Introduce the name of the file you want to encrypt in:");
                String encryptedFile = scan.nextLine();
                encrypter.writeEncryptedData(textFile, encryptedFile + encExtension);
                break;
            }
            case "decrypt": {
                System.out.println("Introduce the name of the file you want to encrypt in:");
                String encryptedFile = scan.nextLine();
                decrypter.writeDecryptedData(encryptedFile + encExtension, encryptedFile + decExtension);
                break;
            }
            default: {
                System.out.println("Introduce one of the two available options.");
                break;
            }
        }
    }
}
