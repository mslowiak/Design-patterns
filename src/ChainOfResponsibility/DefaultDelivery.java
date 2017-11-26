package ChainOfResponsibility;

public class DefaultDelivery extends Delivery {
    @Override
    void deliver(Cargo cargo) {
        System.out.println("You need to specify delivery option manually");
    }
}
