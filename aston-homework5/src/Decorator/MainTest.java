package Decorator;

public class MainTest {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino(1000);
        Sugar sugarCappuccino = new Sugar(cappuccino);
        System.out.println(sugarCappuccino);
    }
}
