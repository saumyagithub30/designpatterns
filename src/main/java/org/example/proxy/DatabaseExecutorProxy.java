package org.example.proxy;

public class DatabaseExecutorProxy implements DatabaseExecutor{
    boolean isAdmin;
    DatabaseExecutorImpl databaseExecutor;

    public DatabaseExecutorProxy(String name, String password) {
        if(name.equals("Admin") && password.equals("admin@123")) {
            isAdmin = true;
            databaseExecutor = new DatabaseExecutorImpl();
        }
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(isAdmin) {
            databaseExecutor.executeDatabase(query);
        } else {
            if(query.equals("DELETE")) {
                throw new Exception("Delete not allowed for non-admin users");
            } else {
                databaseExecutor.executeDatabase(query);
            }
        }
    }
}
