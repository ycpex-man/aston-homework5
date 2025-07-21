package ChainOfResponsibility;

public class RequestHandlerChain {
    public static RequestHandler createChain() {
        RequestHandler lowHandler = new LowHandler();
        RequestHandler middleHandler = new MiddleHandler();
        RequestHandler highHandler = new HighHandler();

        lowHandler.setNextRequestHandler(middleHandler);
        middleHandler.setNextRequestHandler(highHandler);

        return lowHandler;
    }
}
