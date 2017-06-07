package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 9:56
 * <p>
 * 双重检查锁定来优化懒汉式单例
 *
 * 此种方式既可以实现线程实例安全的创建，又不会对性能造成大的影响
 * 由于volatile关键词会屏蔽虚拟机一些代码优化，效率并不高，建议没有特别的需要不要使用
 * 也就是说，虽然可以通过这种凡是实现线程安全的单例，并不建议大量采用
 */
public class LazyModeSingletonDoubleCheck {


    private LazyModeSingletonDoubleCheck() {

    }

    //“双重检查加锁”机制的实现会使用关键字volatile，
    // 它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
    private volatile static LazyModeSingletonDoubleCheck instance = null;

    public static LazyModeSingletonDoubleCheck getInstance() {
        //先检查实例是否存在，不存在才进入同步块
        if (instance == null) {
            //线程安全的创建实例
            synchronized (LazyModeSingletonDoubleCheck.class) {
                //再次检查实例是否存在
                if (instance == null) {
                    instance = new LazyModeSingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

}
