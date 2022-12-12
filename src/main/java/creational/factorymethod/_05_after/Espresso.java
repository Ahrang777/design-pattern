package creational.factorymethod._05_after;

public class Espresso extends Coffee {
    public Espresso(EspressoBean espressoBeans, int waterAmount) {
        super(espressoBeans, waterAmount, "에소프레소 커피");
    }
}
