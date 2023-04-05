package behavioral.strategy.ex2;

public class Korean implements TranslateStrategy {
	@Override
	public void translate() {
		System.out.println("한국어 번역");
	}
}
