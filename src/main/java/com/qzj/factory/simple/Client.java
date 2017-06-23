package com.qzj.factory.simple;

/**
 * 简单工厂模式
 * 客户端免除了直接创建产品对象的责任，而仅仅负责“消费”产品。
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Car car = CarFactory.createCar("benzCar");
        car.driver();

        Car bmwCar = CarFactory.createCar("bmwCar");
        bmwCar.driver();
    }

}
