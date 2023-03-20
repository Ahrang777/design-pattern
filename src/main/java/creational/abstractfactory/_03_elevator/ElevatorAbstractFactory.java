package creational.abstractfactory._03_elevator;

public abstract class ElevatorAbstractFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
    public abstract DirectionLamp createLamp();
    public abstract Elevator createElevator();
}
