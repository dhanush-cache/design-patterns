package behavioral.strategy.compressors;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG");
    }
}
