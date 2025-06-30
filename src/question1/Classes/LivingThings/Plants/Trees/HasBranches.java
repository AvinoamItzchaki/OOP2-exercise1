package Classes.LivingThings.Plants.Trees;

public interface HasBranches {
    default void branches(){
        System.out.println("branches");
    }
}
