package Classes.ElectricMotor;

public interface SpeedControllable {
    default void changeSpeed(int kmh) {
        System.out.println("Speed changed to " + kmh + " km/h");
    }
}
//ElectricMotor