package Decorator;

public class Sugar extends OptionalDecorator{

    public Sugar(Service service) {
        super(service, "Добавили в это чудо сахар! ", 20);
    }
}
