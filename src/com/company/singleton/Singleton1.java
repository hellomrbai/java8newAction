package com.company.singleton;

/**
 * Created by 12430 on 2018/3/26.
 * 懒汉模式，线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){};
    public static Singleton1 getInstance(){
        if (instance == null){
            //return new Singleton1();
            //不能直接return，否则会不断的实例化，达不到只初始化一次的目的
            instance = new Singleton1();
        }
        return instance;
    }
}
