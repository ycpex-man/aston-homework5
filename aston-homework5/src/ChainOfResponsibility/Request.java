package ChainOfResponsibility;

public class Request {
    RequestPriority requestPriority;

    public Request(RequestPriority requestPriority){
        this.requestPriority = requestPriority;
    }

    public RequestPriority getRequestPriority() {
        return requestPriority;
    }
}
