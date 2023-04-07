package behavioral.templatemethod.ex1;

public class Client {
	public static void main(String[] args) {
		AbstractTemplate templateA = new ImplementationA();

		templateA.templateMethod();
	}
}
