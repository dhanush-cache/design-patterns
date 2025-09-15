package creational.builder;

public class Movie {
    public void addFrame(String text, int duration) {
        System.out.println("Adding to movie: " + text + " (" + duration + "s)");
    }
}
