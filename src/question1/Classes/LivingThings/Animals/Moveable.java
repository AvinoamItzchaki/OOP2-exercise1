package Classes.LivingThings.Animals;

public interface Moveable {
    default void move() {
        System.out.println("Moving");
    }
}
