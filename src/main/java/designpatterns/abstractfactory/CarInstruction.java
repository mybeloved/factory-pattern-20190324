package designpatterns.abstractfactory;

/**
 * @Program: factory-pattern-20190324
 * @Description:
 * @Author: whx
 * @Create: 2019-03-24 21:27
 **/
public class CarInstruction implements IInstruction {
	public void read() {
		System.out.println("小汽车说明书");
	}
}
