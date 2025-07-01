package Classes.LivingThings.Animals.Birds;

public interface CanFly {
    default void fly() {
        System.out.println("Flying");
    }
}
