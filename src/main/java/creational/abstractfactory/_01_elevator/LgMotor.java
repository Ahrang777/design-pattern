package creational.abstractfactory._01_elevator;

public class LgMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Lg motor is Moving " + direction);
    }
}
