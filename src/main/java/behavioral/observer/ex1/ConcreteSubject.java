package behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{
	// 관찰자들을 등록하여 담는 리스트
	List<IObserver> observers = new ArrayList<>();

	// 관찰자를 리스트에 등록
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
		System.out.println(observer + " 구독 완료");
	}

	// 관찰자를 리스트에 제거
	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
		System.out.println(observer + " 구독 취소");
	}

	// 관찰자에게 이벤트 송신
	@Override
	public void notifyObserver() {
		for(IObserver o : observers) { // 관찰자 리스트를 순회하며
			o.update(); // 위임
		}
	}
}
