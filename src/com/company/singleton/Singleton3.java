package com.company.singleton;

/**
 * Created by 12430 on 2018/3/26.
 * 饿汉  线程安全  非lazy loading
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){};
    public static synchronized Singleton3 getInstance(){
        return instance;
    }
}
