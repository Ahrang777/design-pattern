package creational.singleton.dcl4;

/**
 * DCL (Double Checked Locking)
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) { // 1번 체크
            synchronized (Singleton.class) {
                if (instance == null) { // 2번 체크 >> double check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // 관련 메서드 ...
    public void print() {
        System.out.println("singleton pattern: DCL");
    }
}
