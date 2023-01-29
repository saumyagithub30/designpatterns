package org.example.singleton;

public class SyncronizedSingletonMethod {

    private static SyncronizedSingletonMethod instance;
    private SyncronizedSingletonMethod() {};
    public static synchronized SyncronizedSingletonMethod getInstance() {
        if(instance == null) {
            instance = new SyncronizedSingletonMethod();
        }
        return instance;
    }
}
