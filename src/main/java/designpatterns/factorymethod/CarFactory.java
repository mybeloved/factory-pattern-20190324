package designpatterns.factorymethod;

import designpatterns.Car;
import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 小汽车工厂
 * @Author: whx
 * @Create: 2019-03-24 20:45
 **/
public class CarFactory implements IVehicleFactory {
	public IVehicle create() {
		return new Car();
	}
}
