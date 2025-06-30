package Classes;

public interface Switchable {
    default void switchOn() {
        System.out.println("Switch On");
    }
}
