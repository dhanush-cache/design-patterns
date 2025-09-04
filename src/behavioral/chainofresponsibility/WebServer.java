package behavioral.chainofresponsibility;

public class WebServer {
    private final Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    void handle(HTTPRequest request) {
        handler.handle(request);
    }
}
