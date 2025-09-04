package behavioral.chainofresponsibility;

public class Logger extends Handler {
    protected Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        System.out.println("Log");
        return false;
    }
}
