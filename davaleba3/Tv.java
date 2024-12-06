package davaleba3;

public class Tv implements Device {
    private boolean onOff;
    private int volume;
    private int channel;

    public Tv(){
        this.onOff=false;
        this.volume=50;
        this.channel=1;
    }

    @Override
    public boolean isEnabled() {
        return onOff;
    }

    @Override
    public void disable() {
        onOff=!onOff;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent>=0 && percent<=100) {
            volume=percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel>0) {
            this.channel=channel;
        }
    }

    @Override
    public void printStatus() {
        System.out.println((onOff ? "ON" : "OFF")+volume+channel);
    }
}