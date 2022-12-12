package creational.factorymethod._05_after;

public class Americano extends Coffee {
    public Americano(EspressoBean espressoBeans, int waterAmount) {
        super(espressoBeans, waterAmount, "아메리카노 커피");
    }
}
