package Classes.LivingThings.Animals.Birds;

public interface HasWings {
    default void hasWings(){
        System.out.println("Has wings");
    }
}
