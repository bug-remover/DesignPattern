package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 9:39
 * 懒汉式单例模式，在第一次调用的时候实例化单例对象
 *
 * 此方法没有考虑线程安全问题，并发情况下可能会产生多个instance，
 * 故此，存在三种改进方法：同步锁，双检查锁定，静态内部类
 */
public class LazyModeSingleton {

    private LazyModeSingleton() {

    }

    private static LazyModeSingleton instance = null;

    //普通懒汉式方法
    public static LazyModeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyModeSingleton();
        }
        return instance;
    }

}
