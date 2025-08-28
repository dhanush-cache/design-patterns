package behavioral.strategy;

import behavioral.strategy.compressors.JPEGCompressor;
import behavioral.strategy.filters.BlackAndWhiteFilter;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("file.jpg");
    }
}
