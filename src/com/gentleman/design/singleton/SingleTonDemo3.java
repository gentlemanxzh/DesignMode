package com.gentleman.design.singleton;

/**
 * 懒汉模式-线程安全
 */
public class SingleTonDemo3 {
    private static SingleTonDemo3 instance;

    private SingleTonDemo3() {

    }

    public static synchronized SingleTonDemo3 getInstance() {
        if (instance == null) {
            instance = new SingleTonDemo3();
        }
        return instance;
    }
}