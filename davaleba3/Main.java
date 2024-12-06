package davaleba3;
public class Main {
    public static void main(String[] args) {


        Device tv=new Tv();
        Device radio=new Radio();

        BasicRemote basicRemoteTv=new BasicRemote(tv);
        basicRemoteTv.power();
        basicRemoteTv.volumeUp();
        basicRemoteTv.channelUp();
        tv.printStatus();


        AdvancedRemote advancedRemoteRadio=new AdvancedRemote(radio);
        advancedRemoteRadio.power();
        advancedRemoteRadio.volumeDown();
        advancedRemoteRadio.mute();
        radio.printStatus();





    }
}