package designpatterns.abstractfactory;

import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 抽象工厂
 * @Author: whx
 * @Create: 2019-03-24 21:19
 **/
public interface IVehicleFactory {
	IVehicle createVehicle();
	
	IPresent createPresent();
	
	IInstruction createInstruction();
}
