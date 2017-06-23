package com.qzj.factory;

/**
 * 传统创建实例的方式
 *
 * 代码耦合度较高，客户端和使用的实例紧密耦合
 */
public class TraditionCreateBean {

    static class BenzCar{
        public void driver(){
            System.out.println("驾驶奔驰车");
        }
    }

    static class BmwCar{
        public void driver(){
            System.out.println("驾驶宝马车");
        }
    }

    public static void main(String[] args) {
        BenzCar benzCar = new BenzCar();
        BmwCar bmwCar = new BmwCar();

        benzCar.driver();
        bmwCar.driver();
    }

}
