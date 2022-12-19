package creational.abstractfactory._01_elevator;

/**
 * 엘리베이터를 생성하는 코드인 Client 에서 직접적인 객체를 이용하여 엘리베이터를 생성한다.
 * OCP 위배
 */
public class Client {
    public static Elevator assembleElevator() {
        Elevator elevator = new LgElevator();
        Motor motor = new LgMotor();
        elevator.setMotor(motor);
        Door door = new LgDoor();
        elevator.setDoor(door);
        motor.setDoor(door);
        DirectionLamp lamp = new LgLamp();
        elevator.setLamp(lamp);
        return elevator;
    }

    public static void main(String[] args) {

        Elevator elevator = assembleElevator();
        elevator.move(Direction.UP);
    }
}
