package Classes.FrequencyDevice.SimpleFrequencyDevice.SmarterFrequencyDevice;

import Classes.FrequencyDevice.SimpleFrequencyDevice.Radio;

public class Television extends Radio implements ResolutionChangable {
    public Television() {
    }

    public void operate() {
        System.out.println("הטלוויזיה עכשיו:");
        switchOn();
        channelTuning();
        controlVolume();
        changeResolution();
        System.out.println("");
    }

}
