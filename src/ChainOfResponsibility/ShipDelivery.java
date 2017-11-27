package ChainOfResponsibility;

import java.util.ArrayList;

public class ShipDelivery extends Delivery{
    private double acceptableWeight = 100;
    private ArrayList<String> countries;

    public ShipDelivery() {
        countries = new ArrayList<>();
        countries.add("Poland");
        countries.add("Germany");
        countries.add("Russia");
        countries.add("Ukraine");
        countries.add("Belarus");
        countries.add("Slovakia");
        countries.add("Czech Republic");
        countries.add("Lithuania");
    }

    @Override
    void deliver(Cargo cargo) {
        if(this.acceptableWeight <= cargo.getWeight() && !countries.contains(cargo.getCountry())){
            System.out.println("Cargo will be sent by Ship");
        }else{
            super.nextDelivery.deliver(cargo);
        }
    }
}
