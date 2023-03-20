package creational.abstractfactory._03_elevator;

/**
 * 추상 팩토리 패턴 적용
 * 추가로 팩토리 클래스 에 대해서 팩토리 메서드 패턴을 적용할 수 있다.
 */
public class Client {
    public static Elevator assembleElevator(ElevatorAbstractFactory factory) {
        Elevator elevator = factory.createElevator();
        Motor motor = factory.createMotor();
        elevator.setMotor(motor);
        Door door = factory.createDoor();
        elevator.setDoor(door);
        motor.setDoor(door);
        DirectionLamp lamp = factory.createLamp();
        elevator.setLamp(lamp);
        return elevator;
    }
    public static void main(String[] args) {
        ElevatorAbstractFactory factory = null;

        // 팩토리 클래스에 대해 팩토리 메서드 패턴을 적용할 수 있다.
        if (args[0].equalsIgnoreCase("LG")) factory = new LgElevatorFactory();
        else if (args[0].equalsIgnoreCase("Hyundai")) factory = new HyundaiElevatorFactory();
        else factory = new SamsungElevatorFactory();
        Elevator elevator = assembleElevator(factory);
        elevator.move(Direction.UP);
    }
}
