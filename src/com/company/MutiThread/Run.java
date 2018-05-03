package com.company.MutiThread;

/**
 * Created by 12430 on 2018/2/28.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
      //  myThread.start();
        System.out.println("运行结束");
    }
}
