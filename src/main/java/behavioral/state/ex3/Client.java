package behavioral.state.ex3;

// ex2에서 싱글톤 적용
public class Client {
	public static void main(String[] args) {
		LaptopContext laptop = new LaptopContext();
		laptop.printCurrentState();

		// 노트북 켜기 : OffState -> OnState
		laptop.pushPowerButton();
		laptop.printCurrentState();
		laptop.pushTypeButton();

		// 노트북 절전하기 : OnState -> SavingState
		laptop.setSavingState();
		laptop.printCurrentState();

		// 노트북 다시 켜기 : SavingState -> OnState
		laptop.pushPowerButton();
		laptop.printCurrentState();

		// 노트북 끄기 : OnState -> OffState
		laptop.pushPowerButton();
		laptop.printCurrentState();
	}
}
