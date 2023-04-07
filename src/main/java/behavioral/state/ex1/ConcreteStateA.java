package behavioral.state.ex1;

public class ConcreteStateA implements State {
	private static final ConcreteStateA INSTANCE = new ConcreteStateA();

	public static State getInstance() {
		return INSTANCE;
	}

	@Override
	public void requestHandle(Context context) {
		System.out.println("A");
	}
}
