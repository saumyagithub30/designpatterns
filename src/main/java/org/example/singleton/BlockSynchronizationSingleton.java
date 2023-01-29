package org.example.singleton;

public class BlockSynchronizationSingleton {

    private static BlockSynchronizationSingleton instance;

    private BlockSynchronizationSingleton() {};

    public static BlockSynchronizationSingleton getInstance() {
        if(instance == null) {
            synchronized (BlockSynchronizationSingleton.class) {
                if(instance==null) {
                    instance = new BlockSynchronizationSingleton();
                }
            }
        }
        return instance;
    }
}
