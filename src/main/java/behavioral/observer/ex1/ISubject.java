package behavioral.observer.ex1;

// 관찰 대상자 / 발행자
public interface ISubject {
	void registerObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyObserver();
}
