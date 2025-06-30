package Classes.LivingThings.Plants;

public interface HasRoots {
    default void hasRoots(){
        System.out.println("Rooted!");
    }
}
