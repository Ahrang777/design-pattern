package behavioral.strategy.ex2;

public class Japanese implements TranslateStrategy {
	@Override
	public void translate() {
		System.out.println("일본어 번역");
	}
}
