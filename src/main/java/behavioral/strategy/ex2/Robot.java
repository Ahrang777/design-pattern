package behavioral.strategy.ex2;

import lombok.Setter;

@Setter
public class Robot {
	private MoveStrategy moveStrategy;
	private TranslateStrategy translateStrategy;

	public Robot(MoveStrategy moveStrategy, TranslateStrategy translateStrategy) {
		this.moveStrategy = moveStrategy;
		this.translateStrategy = translateStrategy;
	}

	public void move() {
		moveStrategy.move();
	}

	public void translate() {
		translateStrategy.translate();
	}
}
