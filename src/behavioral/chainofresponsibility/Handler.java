package behavioral.chainofresponsibility;

public abstract class Handler {
    private final Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(HTTPRequest request) {
        if (doHandle(request)) return;
        if (next != null) next.handle(request);
    }

    public abstract boolean doHandle(HTTPRequest request);
}
