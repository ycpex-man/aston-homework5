package ChainOfResponsibility;

public class HighHandler extends RequestHandler{
    @Override
    public void check(Request request) {
        if (request.getRequestPriority().ordinal() == 2)
            System.out.println("Мы вам вряд ли уже поможем");
    }
}
