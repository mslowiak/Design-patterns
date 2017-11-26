package ChainOfResponsibility;

public abstract class Delivery {
    Delivery nextDelivery;

    public void setNextDelivery(Delivery nextDelivery){
        this.nextDelivery = nextDelivery;
    }

    abstract void deliver(Cargo cargo);
}
