package creational.singleton.volatile5;

/**
 * volatile을 이용한 명령어 reorder 금지
 */
public class Singleton {
    private volatile static Singleton instance;

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
}
