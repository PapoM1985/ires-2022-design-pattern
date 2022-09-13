package it.euris.ires.examples.creational.singleton.simplesingleton;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }
}
