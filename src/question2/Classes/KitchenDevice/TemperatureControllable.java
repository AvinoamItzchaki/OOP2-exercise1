package Classes.KitchenDevice;

public interface TemperatureControllable {
    default void changeTemperature() {
        System.out.println("The temperature in the refrigerator has changed");
    }
}
