package Classes.LivingThings.Plants;

public interface HasLeaves {
    default void shedLeaves(){
        System.out.println("shedding for autumn");
    }
}
