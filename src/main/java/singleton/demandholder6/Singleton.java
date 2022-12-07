package singleton.demandholder6;

/**
 * Initialization on demand(lazy) holder idiom
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {

    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    // 관련 메서드 ...
    public void print() {
        System.out.println("singleton pattern: Initialization on demand(lazy) holder idiom");
    }
}
