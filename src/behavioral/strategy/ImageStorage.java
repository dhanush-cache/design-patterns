package behavioral.strategy;

import behavioral.strategy.compressors.Compressor;
import behavioral.strategy.filters.Filter;

public class ImageStorage {
    private final Compressor compressor;
    private final Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
