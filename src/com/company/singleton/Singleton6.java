package com.company.singleton;

/**
 * Created by 12430 on 2018/3/26.
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 * 而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，推荐！
 */
public enum Singleton6 {
    INSTANCE;
    public void whateverMethod(){};
}
