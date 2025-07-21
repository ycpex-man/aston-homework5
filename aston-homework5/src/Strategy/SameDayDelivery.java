package Strategy;

public class SameDayDelivery implements DeliveryStrategy{

    @Override
    public void delivery() {
        System.out.println("Доставка в тот же день!");
    }
}
