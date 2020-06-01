package com.tsyrulik.singleton.throughEnum;

public enum Singleton {
    INSTANCE;

    public void doWork() {
        System.out.println("singleton is working...");
    }

//    public static void main(String[] args) {
//        Singleton.INSTANCE.doWork();
//    }
}
