package davaleba3;

public class BasicRemote implements Remote {


    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        device.disable();
        System.out.println("power toggle");
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume()+10);
        System.out.println("volume up");
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume()-10);
        System.out.println("volume down");
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel()+1);
        System.out.println("next channel");
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel()-1);
        System.out.println("previous channel");
    }
}
