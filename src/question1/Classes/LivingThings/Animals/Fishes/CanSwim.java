package Classes.LivingThings.Animals.Fishes;

public interface CanSwim {
    default void swim(){
        System.out.println("Swimming");
    }
}
