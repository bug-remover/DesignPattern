package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 9:51
 * <p>
 * 通过加上同步，处理懒汉模式的单例
 */
public class LazyModeSingletonSync {

    private LazyModeSingletonSync() {

    }

    private static LazyModeSingletonSync instance = null;

    //方法上加上同步
    public synchronized static LazyModeSingletonSync getInstance() {
        if (instance == null) {
            instance = new LazyModeSingletonSync();
        }
        return instance;
    }

}
