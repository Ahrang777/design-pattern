package behavioral.strategy.ex2;

public class Client {
	public static void main(String[] args) {
		Robot robot = new Robot(new Walk(), new Korean());
		robot.move();
		robot.translate();

		robot.setMoveStrategy(new Run());
		robot.setTranslateStrategy(new Japanese());

		robot.move();
		robot.translate();
	}
}
