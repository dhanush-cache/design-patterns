package structural.decorator;

public class Main {
    public static void main(String[] args) {
        var stream = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));
        stream.write("1234-1234-1234-1234");
    }
}
