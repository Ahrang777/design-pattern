package behavioral.state.ex3;

public class SavingState implements PowerState {

	private SavingState() {
	}

	private static class SingleInstanceHolder {
		private static final SavingState INSTANCE = new SavingState();
	}

	public static SavingState getInstance() {
		return SingleInstanceHolder.INSTANCE;
	}

	@Override
	public void pushPowerButton(LaptopContext context) {
		System.out.println("노트북 전원 on");
		context.changeState(OnState.getInstance());
	}

	@Override
	public void pushTypeButton() {
		throw new IllegalStateException("노트북이 절전 모드인 상태");
	}

	@Override
	public String toString() {
		return "노트북이 절전 모드 인 상태 입니다.";
	}
}
