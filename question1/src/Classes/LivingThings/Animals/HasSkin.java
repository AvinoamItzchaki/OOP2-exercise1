package Classes.LivingThings.Animals;

public interface HasSkin {
    default void hasSkin(){
        System.out.println("Has Skin");
    }
}
