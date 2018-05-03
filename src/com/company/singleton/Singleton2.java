package com.company.singleton;

/**
 * Created by 12430 on 2018/3/26.
 * 懒汉模式，加锁，性能比较低
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){};
    public static synchronized Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
