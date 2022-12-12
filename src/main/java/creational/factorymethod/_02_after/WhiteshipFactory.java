package creational.factorymethod._02_after;

public class WhiteshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
