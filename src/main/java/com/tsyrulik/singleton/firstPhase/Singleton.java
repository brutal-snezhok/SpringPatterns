package com.tsyrulik.singleton.firstPhase;

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
