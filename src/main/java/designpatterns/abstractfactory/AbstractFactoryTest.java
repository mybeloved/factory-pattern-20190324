package designpatterns.abstractfactory;

import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 抽象工厂测试
 * @Author: whx
 * @Create: 2019-03-24 21:28
 **/
public class AbstractFactoryTest {
	public static void main(String[] args) {
		IVehicleFactory factory = new CarFactory();
		factory.createInstruction().read();
		factory.createPresent().give();
		factory.createVehicle().run();
	}
}
