package com.company.singleton;

/**
 * Created by 12430 on 2018/3/26.
 */
public class Singleton7 {
    private static Singleton7 instance;
    private Singleton7(){};
    public static synchronized Singleton7 getInstance(){
        if(instance == null){
            synchronized (Singleton7.class){
                if (instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}
