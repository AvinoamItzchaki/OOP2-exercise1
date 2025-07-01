package Classes.FrequencyDevice;

public interface ChannelTunable {
    default void channelTuning() {
        System.out.println("Channel Tuning");
    }
}
