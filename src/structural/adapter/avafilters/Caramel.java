package structural.adapter.avafilters;

import structural.adapter.Image;

public class Caramel {
    public void init() {
        System.out.println("Initializing Caramel Filter");
    }

    public void render(Image image) {
        System.out.println("Applying Caramel Filter");
    }
}
