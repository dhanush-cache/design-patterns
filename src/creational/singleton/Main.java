package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Bob");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
