package behavioral.strategy.ex1;

public class ConcreteStrategyA implements IStrategy{
	@Override
	public void doSomething() {
		System.out.println("Strategy A");
	}
}
