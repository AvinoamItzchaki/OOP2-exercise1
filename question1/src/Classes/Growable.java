package Classes;
public interface Growable {
    default void grow() {
        System.out.println("Growing!");
    }
}
