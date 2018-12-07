package com.gentleman.design.singleton;

/**
 * 饿汉模式-线程安全
 */
public class SingleTonDemo2 {

    private static SingleTonDemo2 instance = new SingleTonDemo2();

    private SingleTonDemo2() {

    }

    public static SingleTonDemo2 getInstance() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }

}
