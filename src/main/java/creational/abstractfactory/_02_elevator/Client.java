package creational.abstractfactory._02_elevator;

/**
 * 팩토리 메서드 패턴 적용
 * 기능 별 팩토리 생성 >> DoorFactory, ElevatorFactory ,,,
 */
public class Client {
    public static Elevator assembleElevator(VendorId id) {
        Elevator elevator = ElevatorFactory.createElevator(id);
        Motor motor = MotorFactory.createMotor(id);
        elevator.setMotor(motor);
        Door door = DoorFactory.createDoor(id);
        elevator.setDoor(door);
        motor.setDoor(door);
        DirectionLamp lamp = LampFactory.createLamp(id);
        elevator.setLamp(lamp);
        return elevator;
    }

    public static void main(String[] args) {

        Elevator elevator = assembleElevator(VendorId.HYUNDAI);
        elevator.move(Direction.UP);
    }
}
