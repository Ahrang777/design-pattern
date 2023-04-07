package behavioral.state.ex3;

public class LaptopContext {
	private PowerState state;

	public LaptopContext() {
		this.state = OffState.getInstance();
	}

	public void changeState(PowerState state) {
		this.state = state;
	}

	public void setSavingState() {
		System.out.println("노트북 절전 모드");
		changeState(SavingState.getInstance());
	}

	public void pushPowerButton() {
		state.pushPowerButton(this);
	}

	public void pushTypeButton() {
		state.pushTypeButton();
	}

	public void printCurrentState() {
		System.out.println(state);
	}
}
