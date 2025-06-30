package Classes.LivingThings.Animals.Fishes;

public interface HasGills {
    default void breatheUnderwater(){
        System.out.println("Breathing underwater!");
    }
}
