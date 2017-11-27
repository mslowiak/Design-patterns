package ChainOfResponsibility;

public class PolishPostDelivery extends Delivery{
    private double acceptableWeight = 0.5;
    @Override
    void deliver(Cargo cargo) {
        System.out.println(cargo.getWeight() + " " + acceptableWeight);
        if(cargo.getWeight() <= this.acceptableWeight && cargo.getCountry().equals("Poland")){
            System.out.println("Cargo will be send by Polish Post");
        }else {
            super.nextDelivery.deliver(cargo);
        }
    }
}
