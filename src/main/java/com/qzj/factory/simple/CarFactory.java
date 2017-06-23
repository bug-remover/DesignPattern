package com.qzj.factory.simple;

/**
 * ProjectName:DesignPattern
 * PackageName:com.qzj.factory.simple
 * Date:2017/6/23 12:00
 */
public class CarFactory {

    public static Car createCar(String param) throws Exception {
        if("benzCar".equals(param)){
            return new BenzCar();
        }
        if("bmwCar".equals(param)){
            return new BmwCar();
        }
        throw new Exception("没有此类型");
    }

}
