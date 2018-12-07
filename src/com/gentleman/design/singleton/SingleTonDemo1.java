package com.gentleman.design.singleton;

/**
 * 懒汉模式-线程不安全
 */
public class SingleTonDemo1 {
    private static SingleTonDemo1 instance;

    private SingleTonDemo1() {

    }

    public static SingleTonDemo1 getInstance() {
        if (instance == null) {

            //模拟线程阻塞
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingleTonDemo1();
        }
        return instance;
    }


}
