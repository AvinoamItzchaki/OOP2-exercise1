package Classes.FrequencyDevice.SimpleFrequencyDevice;
public interface VolumeControllable {
    default void controlVolume() {
        System.out.println("Control Volume");
    }
}

