package com.gentleman.design.singleton;

/**
 * 静态内部类
 */
public class SingleTonDemo5 {

    private SingleTonDemo5(){

    }

    private static class Holder{
        private static final SingleTonDemo5 INSTANCE = new SingleTonDemo5();
    }

    public static SingleTonDemo5 getInstance(){
        return Holder.INSTANCE;
    }
}
