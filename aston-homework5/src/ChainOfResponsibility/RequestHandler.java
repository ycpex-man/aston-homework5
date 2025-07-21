package ChainOfResponsibility;

public abstract class RequestHandler {

    RequestHandler nextRequestHandler;

    public void setNextRequestHandler(RequestHandler nextRequestHandler){
        this.nextRequestHandler = nextRequestHandler;
    }

    public void checkNextRequest(Request request){
        if (nextRequestHandler != null)
            nextRequestHandler.check(request);
    }



    public abstract void check(Request request);
}
