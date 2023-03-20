package creational.abstractfactory._02_elevator;

public class HyundaiLamp extends DirectionLamp {
    @Override
    protected void doLight(Direction direction) {
        System.out.println("Hyundai Lamp "+direction);
    }
}
