package behavioral.command.composite;

public class Main {
    public static void main(String[] args) {
        var command = new CompositeCommand();
        command.add(new ResizeCommand());
        command.add(new BlackAndWhiteCommand());
        command.execute();
    }
}
