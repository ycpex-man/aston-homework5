package ChainOfResponsibility;

public class LowHandler extends RequestHandler{
    @Override
    public void check(Request request) {
        if (request.getRequestPriority().ordinal() == 0)
            System.out.println("Ваш запрос базового уровня. Дождитесь соединения с оператором");
        checkNextRequest(request);
    }
}
