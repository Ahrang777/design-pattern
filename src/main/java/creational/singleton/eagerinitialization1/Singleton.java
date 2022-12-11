package creational.singleton.eagerinitialization1;

/**
 * Eager Initialization
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    // 관련 메서드 ...
    public void print() {
        System.out.println("singleton pattern: 싱글 쓰레드 Eager Initialization");
    }
}
