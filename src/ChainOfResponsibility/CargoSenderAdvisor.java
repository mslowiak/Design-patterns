package ChainOfResponsibility;

public class CargoSenderAdvisor {
    private Delivery delivery;

    public CargoSenderAdvisor() {
        PolishPostDelivery polishPostDelivery = new PolishPostDelivery();
        CourierDelivery courierDelivery = new CourierDelivery();
        OwnTransportDelivery ownTransportDelivery = new OwnTransportDelivery();
        PlaneDelivery planeDelivery = new PlaneDelivery();
        ShipDelivery shipDelivery = new ShipDelivery();
        DefaultDelivery defaultDelivery = new DefaultDelivery();
        delivery = polishPostDelivery;

        delivery.setNextDelivery(courierDelivery);
        courierDelivery.setNextDelivery(ownTransportDelivery);
        ownTransportDelivery.setNextDelivery(planeDelivery);
        planeDelivery.setNextDelivery(shipDelivery);
        shipDelivery.setNextDelivery(defaultDelivery);
        defaultDelivery.setNextDelivery(null);
    }

    void adviseSendingWay(Cargo cargo){
        System.out.println("\nI want to send cargo to " + cargo.getCountry() + " with weight " + cargo.getWeight());
        delivery.deliver(cargo);
    }
}
