package com.tsyrulik.singleton.secondPhase;

//does work in multithreading but has a bad performance
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
