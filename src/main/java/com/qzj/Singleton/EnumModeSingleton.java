package com.qzj.Singleton;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.Singleton
 * Date:2017/6/7 15:51
 *
 * 使用枚举来实现单例会更加简洁，而且无偿提供了序列化机制，
 * 并由JVM从根本上提供保障，防止多次实例化，是简洁、高效、安全的实现单例的方式
 */
public enum EnumModeSingleton {

    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        EnumModeSingleton instance = EnumModeSingleton.INSTANCE;
        instance.setName("tom");
        System.out.println("instance name is" + instance.getName());

        EnumModeSingleton instance2 = EnumModeSingleton.INSTANCE;
        System.out.println("instance2 name is"+instance2.getName());
    }
}
