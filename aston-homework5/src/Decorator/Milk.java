package Decorator;

public class Milk extends OptionalDecorator{

    public Milk(Service service) {
        super(service, "Добавили в это чудо молока! ", 150);
    }
}
