package Classes.ElectricMotor;

import Classes.ElectronicDevice;

public class ElectricMotor extends ElectronicDevice implements SpeedControllable {
    public ElectricMotor() {
    }

    public void operate() {
        System.out.println("המנוע החשמלי עכשיו:");
        switchOn();
        changeSpeed(100);
        System.out.println();
    }
}
