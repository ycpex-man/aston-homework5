package Decorator;

public class Syrup extends OptionalDecorator{

    public Syrup(Service service) {
        super(service, "Добавили в это чудо сиропа! ", 100);
    }
}
