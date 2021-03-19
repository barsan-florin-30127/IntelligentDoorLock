package isp.lab8.safehome;

public class TenantAlreadyExistsException extends Exception {
    public TenantAlreadyExistsException() {
        System.out.println("Tenant already exist!");
    }
}