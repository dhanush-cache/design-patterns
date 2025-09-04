package structural.composite;

public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        group1.add(group2);
        group1.render();
        group1.move();
    }
}
