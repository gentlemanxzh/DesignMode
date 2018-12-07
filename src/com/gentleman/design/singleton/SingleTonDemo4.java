package com.gentleman.design.singleton;

/**
 * 懒汉模式-线程安全
 */
public class SingleTonDemo4 {
    private volatile  static SingleTonDemo4 instance;
    private SingleTonDemo4(){

    }

    public static SingleTonDemo4 getInstance(){
        if (instance==null){
            synchronized (SingleTonDemo4.class){
                if (instance==null){
                    instance = new SingleTonDemo4();
                }
            }
        }
        return instance;
    }
}
