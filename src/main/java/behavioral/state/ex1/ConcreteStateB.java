package behavioral.state.ex1;

public class ConcreteStateB implements State {
	private static final ConcreteStateB INSTANCE = new ConcreteStateB();

	public static State getInstance() {
		return INSTANCE;
	}

	@Override
	public void requestHandle(Context context) {
		System.out.println("B");
		context.setState(ConcreteStateC.getInstance());
	}
}
