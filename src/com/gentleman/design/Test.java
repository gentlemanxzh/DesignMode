package com.gentleman.design;

import com.gentleman.design.singleton.SingleTonDemo1;
import com.gentleman.design.singleton.SingleTonDemo2;
import com.gentleman.design.singleton.SingleTonDemo3;

public class Test {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        t1.start();
        t2.start();

    }


}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread:" + SingleTonDemo3.getInstance().toString());
    }
}
