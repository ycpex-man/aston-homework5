package Decorator;

public class OptionalDecorator implements Service {
    private Service service;
    private String info;
    private double price;

    public OptionalDecorator(Service service, String info, double price){
        this.service = service;
        this.info = info;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price + service.getPrice();
    }

    @Override
    public String getInfo() {
        return info + service.getInfo();
    }

    @Override
    public String toString() {
        return "OptionalDecorator{" +
                ", info='" + info + service.getInfo() + '\'' +
                ", price=" + price +
                '}';
    }
}
