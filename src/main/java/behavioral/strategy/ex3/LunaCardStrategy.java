package behavioral.strategy.ex3;

public class LunaCardStrategy implements PaymentStrategy {
	private String emailId;
	private String password;

	public LunaCardStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + "원 paid by luna card");
	}
}
