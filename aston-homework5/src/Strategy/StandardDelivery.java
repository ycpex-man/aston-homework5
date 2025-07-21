package Strategy;

public class StandardDelivery implements DeliveryStrategy{
    @Override
    public void delivery() {
        System.out.println("Стандартная доставка. Доставка в течении 3-5 дней");
    }
}
