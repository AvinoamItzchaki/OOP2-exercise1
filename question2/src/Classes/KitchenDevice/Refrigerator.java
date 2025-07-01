package Classes.KitchenDevice;

import Classes.ElectronicDevice;

public class Refrigerator extends ElectronicDevice implements TemperatureControllable {
    public Refrigerator() {
    }

    public void operate() {
        System.out.println("המקרר עכשיו:");
        switchOn();
        changeTemperature();
        System.out.println();
    }
}
