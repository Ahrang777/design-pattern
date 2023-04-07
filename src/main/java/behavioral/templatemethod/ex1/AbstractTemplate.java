package behavioral.templatemethod.ex1;

public abstract class AbstractTemplate {
	// final 을 붙여서 자식 클래스에서 오버라이딩 못하게 막음
	public final void templateMethod() {
		step1();
		step2();

		if (hook()) {	// hook() 을 통해 내부로직 실행여부 결정
			// ...
		}

		step3();
	}

	// 기본적으로 제공하고 원하는 경우 자식 클래스에서 오버라이딩 하도록 함
	// step1, 2, 3 은 무조건 오버라이딩 해야하는것과 달리 hook 은 원하는 경우만 오버라이딩 하도록 구현
	protected boolean hook() {
		return true;
	}

	protected abstract void step1();

	protected abstract void step2();

	protected abstract void step3();
}
