package davaleba3;

public interface Device {

    boolean isEnabled();
    void disable();
    void setVolume(int percent);
    int getVolume();
    void setChannel(int channel);
    int getChannel();
    void printStatus();
}
