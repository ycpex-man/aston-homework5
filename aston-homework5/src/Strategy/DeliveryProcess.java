package Strategy;

public class DeliveryProcess {
    private DeliveryStrategy deliveryStrategy;

    public DeliveryProcess(DeliveryStrategy deliveryStrategy){
        this.deliveryStrategy = deliveryStrategy;
    }

    public void printDeliveryStrategy(){
        deliveryStrategy.delivery();
    }

    public static void main(String[] args) {
        DeliveryProcess deliveryProcess;

        deliveryProcess = new DeliveryProcess(new ExpressDelivery());
        deliveryProcess.printDeliveryStrategy();

        deliveryProcess = new DeliveryProcess(new StandardDelivery());
        deliveryProcess.printDeliveryStrategy();

        deliveryProcess = new DeliveryProcess(new SameDayDelivery());
        deliveryProcess.printDeliveryStrategy();
    }
}
