package designpatterns.abstractfactory;

import designpatterns.Car;
import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 小汽车工厂
 * @Author: whx
 * @Create: 2019-03-24 21:25
 **/
public class CarFactory implements IVehicleFactory {
	public IVehicle createVehicle() {
		return new Car();
	}
	
	public IPresent createPresent() {
		return new CarPresent();
	}
	
	public IInstruction createInstruction() {
		return new CarInstruction();
	}
}
