package designpatterns.factorymethod;

import designpatterns.Car;
import designpatterns.IVehicle;
import designpatterns.Motorcycle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 小汽车工厂
 * @Author: whx
 * @Create: 2019-03-24 20:45
 **/
public class MotorCycleFactory implements IVehicleFactory {
	public IVehicle create() {
		return new Motorcycle();
	}
}
