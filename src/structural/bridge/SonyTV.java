package structural.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony Channel: " + number);
    }
}
