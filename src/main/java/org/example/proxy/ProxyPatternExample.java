package org.example.proxy;

public class ProxyPatternExample {
    public static void main(String[] args) throws Exception {
        DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("NonAdmin", "Test@123");
//        nonAdminExecutor.executeDatabase("DELETE");

        DatabaseExecutor adminExecutor = new DatabaseExecutorProxy("Admin", "admin@123");
        adminExecutor.executeDatabase("DELETE");
    }
}
