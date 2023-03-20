package behavioral.observer;

public interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();	// Subject 객체의 상태 변경시 이를 모든 옵저버에게 알린다.
}
