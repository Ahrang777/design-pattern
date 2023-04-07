package behavioral.state.ex1;

public class ConcreteStateC implements State {
	private static final ConcreteStateC INSTANCE = new ConcreteStateC();

	public static State getInstance() {
		return INSTANCE;
	}

	@Override
	public void requestHandle(Context context) {
		System.out.println("C");
	}
}
