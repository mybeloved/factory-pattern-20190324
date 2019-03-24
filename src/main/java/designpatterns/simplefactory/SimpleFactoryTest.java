package designpatterns.simplefactory;

import designpatterns.Car;
import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 简单工厂测试
 * @Author: whx
 * @Create: 2019-03-24 20:03
 **/
public class SimpleFactoryTest {
	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		IVehicle vehicle = factory.create(Car.class);
		vehicle.run();
	}
}
