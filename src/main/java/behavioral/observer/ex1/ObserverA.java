package behavioral.observer.ex1;

public class ObserverA implements IObserver{
	@Override
	public void update() {
		System.out.println("ObserverA 한테 이벤트 알림이 왔습니다.");
	}
}
