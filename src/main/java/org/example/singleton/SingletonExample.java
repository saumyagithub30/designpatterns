package org.example.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        //Early Initialization
        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance);
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);

        //Lazy Initialization
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance2);
        SingletonLazy instance3 = SingletonLazy.getInstance();
        System.out.println(instance3);

        //Thread Safe at Method Level Singleton
        SyncronizedSingletonMethod instance4 = SyncronizedSingletonMethod.getInstance();
        System.out.println(instance4);
        SyncronizedSingletonMethod instance5 = SyncronizedSingletonMethod.getInstance();
        System.out.println(instance5);

        //Thread Safe at Block Level Singleton
        BlockSynchronizationSingleton instance6 = BlockSynchronizationSingleton.getInstance();
        System.out.println(instance6);
        BlockSynchronizationSingleton instance7 = BlockSynchronizationSingleton.getInstance();
        System.out.println(instance7);




    }
}
