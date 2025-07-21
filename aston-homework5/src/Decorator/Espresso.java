package Decorator;

public class Espresso implements Service{
    private double price;
    private String info = "Эспрессо - это концентрированный кофейный напиток, получаемый путем пропускания " + "\n" +
            "горячей воды под давлением через молотый кофе. Он является основой для многих других кофейных напитков, " + "\n" +
            "таких как капучино и американо. В Италии эспрессо считается национальным напитком и неотъемлемой частью культуры.";

    public Espresso(double price) {
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
        return "Espresso{" +
                "price=" + price +
                ", info='" + info + '\'' +
                '}';
    }
}
