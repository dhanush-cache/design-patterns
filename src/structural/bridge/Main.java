package structural.bridge;

public class Main {
    public static void main(String[] args) {
        var sonyRemote = new RemoteControl(new SonyTV());
        sonyRemote.turnOn();
        sonyRemote.turnOff();

        var samsungRemote = new AdvancedRemoteControl(new SamsungTV());
        samsungRemote.turnOn();
        samsungRemote.setChannel(64);
        samsungRemote.turnOff();
    }
}
