package Decorator;

public class Cappuccino implements Service{
    private double price;
    private String info = "Капучино (Cappuccino) - это кофейный напиток, состоящий из эспрессо, " + "\n" +
            "горячего молока и молочной пены. Он отличается от других кофейных напитков, таких как латте, " + "\n" +
            "более высокой долей молочной пены.";

    public Cappuccino(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "price=" + price +
                ", info='" + info + '\'' +
                '}';
    }
}
