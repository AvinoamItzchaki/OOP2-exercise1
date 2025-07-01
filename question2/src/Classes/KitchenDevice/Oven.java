package Classes.KitchenDevice;

import Classes.ElectronicDevice;

public class Oven extends ElectronicDevice implements HeatUp,BakeTimerControllable {
    public Oven() {
    }

    public void operate() {
        System.out.println("התנור עכשיו:");
        switchOn();
        startHeating();
        addBakeTime(15);
        System.out.println();
    }
}
