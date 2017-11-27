package ChainOfResponsibility;

public class CourierDelivery extends Delivery{
    private double acceptableWeight = 20;

    @Override
    void deliver(Cargo cargo) {
        if(cargo.getWeight() <= this.acceptableWeight && cargo.getCountry().equals("Poland")){
            System.out.println("Cargo will be send by courier");
        }else{
            super.nextDelivery.deliver(cargo);
        }
    }
}
