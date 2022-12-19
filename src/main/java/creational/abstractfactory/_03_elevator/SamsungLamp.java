package creational.abstractfactory._03_elevator;

public class SamsungLamp extends DirectionLamp {
    @Override
    protected void doLight(Direction lampStatus) {
        System.out.println("Samsung lamp "+ lampStatus);
    }
}
