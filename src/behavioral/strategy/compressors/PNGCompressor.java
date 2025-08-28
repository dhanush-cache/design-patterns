package behavioral.strategy.compressors;

public class PNGCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using PNG");
    }
}
