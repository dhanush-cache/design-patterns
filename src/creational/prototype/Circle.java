package creational.prototype;

public class Circle implements Component {
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering a Circle");
    }

    @Override
    public Component clone() {
        var circle = new Circle();
        circle.setRadius(radius);
        return circle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
