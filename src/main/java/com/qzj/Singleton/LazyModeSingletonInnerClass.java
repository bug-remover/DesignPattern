package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 10:06
 * <p>
 * 通过静态内部类的方式优化懒汉式单例模式
 *
 * 此方法优于同步实现和双检查方式，即实现了线程安全，又避免了同步带来的性能问题，
 *
 * 当getInstance方法被第一次调用时，它第一次读取 SingletonHolder.instance，导致SingletonHolder类得到初始化；
 * 而这个类在装载并被初始化的时候，会初始化它的静 态域，
 * 从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
 *
 * 这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
 */
public class LazyModeSingletonInnerClass {

    private LazyModeSingletonInnerClass() {

    }

    /**
     * 内部类，静态成员式的内部类
     * 此内部类和外部类实例没有绑定关系，只有调用的时候才会初始化，从而实现了延迟加载
     */
    public static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static LazyModeSingletonInnerClass instance = new LazyModeSingletonInnerClass();
    }

    public static LazyModeSingletonInnerClass getInstace() {
        return SingletonHolder.instance;
    }

}
