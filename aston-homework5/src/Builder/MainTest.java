package Builder;

public class MainTest {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder().model("Lada").body("Sedan").year(2002).pressure(2.2).wheelsCount(4).build();
        System.out.println(car1);
    }
}
