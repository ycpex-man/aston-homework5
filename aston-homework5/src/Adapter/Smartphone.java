package Adapter;

public class Smartphone {
    String name;
    private Charge charge;

    public Smartphone(String name, Charge charge) {
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ElectricalSocket socket = new ElectricalSocket();
        Charger charger = new Charger(socket);
        Smartphone xiaomi = new Smartphone("Xiaomi", charger);
        charger.charge(xiaomi);
    }
}
