package Adapter;

public class Charger implements Charge{

    ElectricalSocket electricalSocket;

    public Charger(ElectricalSocket electricalSocket){
        this.electricalSocket = electricalSocket;
    }

    @Override
    public void charge(Smartphone smartphone) {
        electricalSocket.voltage();
        System.out.println("Зарядка " + smartphone.getName() + " пошла!");
    }
}
