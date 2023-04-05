package behavioral.strategy.ex1;

public class Context {
	private IStrategy strategy;

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void doSomething() {
		strategy.doSomething();
	}
}
