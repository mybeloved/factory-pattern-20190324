package designpatterns.factorymethod;

import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 工厂方法测试
 * @Author: whx
 * @Create: 2019-03-24 20:53
 **/
public class FactoryMethodTest {
	public static void main(String[] args) {
		IVehicleFactory factory = new CarFactory();
		IVehicle vehicle = factory.create();
		vehicle.run();
	}
}
