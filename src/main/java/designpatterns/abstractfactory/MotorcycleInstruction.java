package designpatterns.abstractfactory;

/**
 * @Program: factory-pattern-20190324
 * @Description:
 * @Author: whx
 * @Create: 2019-03-24 21:34
 **/
public class MotorcycleInstruction implements IInstruction {
	public void read() {
		System.out.println("摩托车说明书");
	}
}
