package behavioral.observer.ex1;

public class Client {
	public static void main(String[] args) {

		// 발행자 등록
		ISubject publisher = new ConcreteSubject();

		// 발행자를 구독할 관찰자들 리스트로 등록
		IObserver o1 = new ObserverA();
		IObserver o2 = new ObserverB();
		publisher.registerObserver(o1);
		publisher.registerObserver(o2);

		// 관찰자에게 이벤트 전파
		publisher.notifyObserver();

		// ObserverB가 구독 취소
		publisher.removeObserver(o2);

		// ObserverA 한테만 이벤트 전파
		publisher.notifyObserver();
	}
}
