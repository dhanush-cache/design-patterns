package structural.adapter;

import structural.adapter.avafilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
        imageView.apply(new CaramelAdapter());
    }
}
