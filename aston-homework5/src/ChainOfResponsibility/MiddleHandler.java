package ChainOfResponsibility;

public class MiddleHandler extends RequestHandler{
    @Override
    public void check(Request request) {
        if (request.getRequestPriority().ordinal() == 1)
            System.out.println("Ваш запрос по техническим проблемам. Дождитесь мастера, он всё починит.");
        checkNextRequest(request);
    }
}
