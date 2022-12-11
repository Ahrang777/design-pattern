package creational.singleton.lazyinitialization2;

/**
 * Lazy Initialization
 * 필요할때 instance를 생성하는 방식
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 관련 메서드 ...
    public void print() {
        System.out.println("singleton pattern: 싱글 쓰레드 Lazy Initialization");
    }
}
