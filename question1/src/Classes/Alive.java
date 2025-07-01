package Classes;

public interface Alive {
    default void alive() {
        System.out.println("living!");
    }
}
