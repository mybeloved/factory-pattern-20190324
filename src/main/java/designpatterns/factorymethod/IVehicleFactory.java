package designpatterns.factorymethod;

import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 载具工厂
 * @Author: whx
 * @Create: 2019-03-24 20:38
 **/
public interface IVehicleFactory {
	IVehicle create();
}
