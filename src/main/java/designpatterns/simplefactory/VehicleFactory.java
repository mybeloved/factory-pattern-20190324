package designpatterns.simplefactory;

import designpatterns.IVehicle;

/**
 * @Program: factory-pattern-20190324
 * @Description: 载具工厂
 * @Author: whx
 * @Create: 2019-03-24 20:02
 **/
public class VehicleFactory {
	public IVehicle create(Class clazz) {
		if (null != clazz) {
			try {
				return (IVehicle) clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
