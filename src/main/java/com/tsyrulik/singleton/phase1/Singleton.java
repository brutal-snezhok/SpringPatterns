package com.tsyrulik.singleton.phase1;

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
