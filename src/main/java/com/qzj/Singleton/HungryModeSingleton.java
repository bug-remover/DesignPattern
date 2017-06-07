package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 10:25
 *
 * 饿汉模式单例：在类初始化时，已经实例化
 *
 * 饿汉模式在类创建的时候就创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的
 */
public class HungryModeSingleton {

    private HungryModeSingleton() {

    }

    private static HungryModeSingleton instance = new HungryModeSingleton();

    public static HungryModeSingleton getInstance() {
        return instance;
    }

}
