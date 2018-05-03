package com.company.MutiThread;

/**
 * Created by 12430 on 2018/2/28.
 */
public class test {
    public static void main(String[] args) {
        System.out.printf(Thread.currentThread().getName());
        try{
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for(int i= 0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main"+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
