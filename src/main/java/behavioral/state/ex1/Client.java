package behavioral.state.ex1;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(ConcreteStateA.getInstance());

		context.request();

		context.setState(ConcreteStateB.getInstance());
		context.request();

		context.request();
	}
}
