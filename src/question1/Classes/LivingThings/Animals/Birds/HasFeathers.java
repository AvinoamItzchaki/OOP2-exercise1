package Classes.LivingThings.Animals.Birds;

public interface HasFeathers {
    default void hasFeathers(){
        System.out.println("has Feathers");
    }
}
