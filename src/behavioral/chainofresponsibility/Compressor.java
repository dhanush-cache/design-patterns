package behavioral.chainofresponsibility;

public class Compressor extends Handler {
    protected Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        System.out.println("Compress");
        return false;
    }
}
