package behavioral.templatemethod.ex2;

public class Client {
	public static void main(String[] args) {
		final String path = "src/main/resources/numbers.txt";

		FileProcessor plusFileProcessor = new PlusFileProcessor(path);
		System.out.println(plusFileProcessor.process());

		FileProcessor multiplyFileProcessor = new MultiplyFileProcessor(path);
		System.out.println(multiplyFileProcessor.process());
	}
}
