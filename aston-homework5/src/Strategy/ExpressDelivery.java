package Strategy;

public class ExpressDelivery implements DeliveryStrategy{
    @Override
    public void delivery() {
        System.out.println("Экспресс-доставка. Доставка на следующий день.");
    }
}
