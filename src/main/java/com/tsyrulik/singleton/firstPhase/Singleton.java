package com.tsyrulik.singleton.firstPhase;

// doesn't work correctly in multithreading
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
