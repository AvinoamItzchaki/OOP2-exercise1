package Classes.LivingThings.Animals.Birds.Canary;

public interface CanSing {
    default void canSing(){
        System.out.println("Singing");
    }
}
