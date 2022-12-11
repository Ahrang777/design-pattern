package creational.singleton;

import creational.singleton.demandholder6.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.print();
    }
}
