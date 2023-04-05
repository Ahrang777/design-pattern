package behavioral.strategy.ex3;

public class User {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// 쇼핑 물품
		Item A = new Item("맥북 프로", 10000);
		Item B = new Item("플레이스테이션", 30000);
		cart.addItem(A);
		cart.addItem(B);

		// LUNACard로 결제 전략 실행
		cart.pay(new LunaCardStrategy("kundol@example.com", "pukubababo")); // 4000원 paid using LUNACard.

		// KAKAOBank로 결제 전략 실행
		cart.pay(new KakaoCardStrategy("Ju hongchul", "123456789", "123", "12/01")); // 4000원 paid using KAKAOCard.
	}
}
