package structural.bridge;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung Channel: " + number);
    }
}
