package isp.lab8.safehome;

public class InvalidPinException extends Exception {
    public InvalidPinException() {
        System.out.println("Invalid pin.Please try again");
    }
}