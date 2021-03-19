package isp.lab8.safehome;

public class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException() {
        System.out.println("To many attempts to introduce right pin.");
    }
}