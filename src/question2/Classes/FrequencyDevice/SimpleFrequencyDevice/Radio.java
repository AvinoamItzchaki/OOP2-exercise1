package Classes.FrequencyDevice.SimpleFrequencyDevice;

import Classes.FrequencyDevice.FrequencyDevice;

public class Radio extends FrequencyDevice implements VolumeControllable {
    public Radio() {
    }
    public void operate() {
        System.out.println("הרדיו עכשיו:");
        switchOn();
        channelTuning();
        controlVolume();
        System.out.println();
    }
}
