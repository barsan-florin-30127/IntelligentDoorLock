package isp.lab8.safehome;

public class TenantNotFoundException extends Exception {
    public TenantNotFoundException() {
        System.out.println("Tenant not found");
    }
}