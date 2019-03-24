package designpatterns.abstractfactory;

/**
 * @Program: factory-pattern-20190324
 * @Description:
 * @Author: whx
 * @Create: 2019-03-24 21:27
 **/
public class CarPresent implements IPresent {
	public void give() {
		System.out.println("小汽车礼物");
	}
}
