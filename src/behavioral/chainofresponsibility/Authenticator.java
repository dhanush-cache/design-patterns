package behavioral.chainofresponsibility;

public class Authenticator extends Handler {
    protected Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        var isValid = request.getUsername().equals("admin") && request.getPassword().equals("1234");
        System.out.println("Authentication");
        return !isValid;
    }
}
