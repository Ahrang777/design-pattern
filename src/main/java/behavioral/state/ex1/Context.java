package behavioral.state.ex1;

import lombok.Setter;

@Setter
public class Context {
	private State state;

	public void request() {
		state.requestHandle(this);
	}
}
