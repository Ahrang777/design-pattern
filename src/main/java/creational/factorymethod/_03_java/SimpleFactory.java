package creational.factorymethod._03_java;

import creational.factorymethod._02_after.Blackship;
import creational.factorymethod._02_after.Whiteship;

public class SimpleFactory {
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
