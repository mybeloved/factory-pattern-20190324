package designpatterns.abstractfactory;

/**
 * @Program: factory-pattern-20190324
 * @Description:
 * @Author: whx
 * @Create: 2019-03-24 21:33
 **/
public class MotorcyclePresent implements IPresent {
	public void give() {
		System.out.println("摩托车礼物");
	}
}
