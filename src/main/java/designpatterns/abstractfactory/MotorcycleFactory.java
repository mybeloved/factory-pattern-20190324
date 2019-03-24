package designpatterns.abstractfactory;

import designpatterns.IVehicle;
import designpatterns.Motorcycle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 摩托车工厂
 * @Author: whx
 * @Create: 2019-03-24 21:30
 **/
public class MotorcycleFactory implements IVehicleFactory {
	public IVehicle createVehicle() {
		return new Motorcycle();
	}
	
	public IPresent createPresent() {
		return new MotorcyclePresent();
	}
	
	public IInstruction createInstruction() {
		return new MotorcycleInstruction();
	}
}
