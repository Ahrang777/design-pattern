package singleton.synchronized3;

/**
 * synchronized를 통해 멀티 쓰레드에 대해 thread safe 하게 작성
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 관련 메서드 ...
    public void print() {
        System.out.println("singleton pattern: synchronized");
    }
}
