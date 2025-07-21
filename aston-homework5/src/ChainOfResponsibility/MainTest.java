package ChainOfResponsibility;

public class MainTest {
    public static void main(String[] args) {
        RequestHandler chain = RequestHandlerChain.createChain();

        Request firstRequest = new Request(RequestPriority.LOW);
        Request secondRequest = new Request(RequestPriority.MIDDLE);
        Request thirdRequest = new Request(RequestPriority.HIGH);

        chain.check(firstRequest);
    }
}
