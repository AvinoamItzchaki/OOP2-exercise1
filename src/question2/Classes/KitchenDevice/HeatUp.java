package Classes.KitchenDevice;

public interface HeatUp {
    default void startHeating() {
        System.out.println("Oven starts to heat up");
    }
}
