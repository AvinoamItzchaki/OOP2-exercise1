package Classes.KitchenDevice;

public interface BakeTimerControllable {
    default void addBakeTime(int minutes) {
        System.out.println("Added " + minutes + " minutes to the baking timer");
    }
}
