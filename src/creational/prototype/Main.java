package creational.prototype;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle();
        var contextMenu = new ContextMenu();
        contextMenu.duplicate(circle);
    }
}
