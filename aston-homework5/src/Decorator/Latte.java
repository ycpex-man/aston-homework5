package Decorator;

public class Latte implements Service{

    private double price;
    private String info = "Латте - это кофейный напиток, состоящий из эспрессо и вспененного молока, " + "\n" +
            "часто подаваемый в высоком стакане. В переводе с итальянского \"latte\" означает \"молоко\". " + "\n" +
            "Латте отличается от других кофейных напитков, таких как капучино, большим количеством молока и тонким слоем молочной пены.";

    public Latte(double price){
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
}
