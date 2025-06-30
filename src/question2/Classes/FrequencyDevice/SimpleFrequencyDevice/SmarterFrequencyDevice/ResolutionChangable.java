package Classes.FrequencyDevice.SimpleFrequencyDevice.SmarterFrequencyDevice;

public interface ResolutionChangable {
    default void changeResolution() {
        System.out.println("Change Resolution");
    }
}
