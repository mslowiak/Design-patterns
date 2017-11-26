package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaneDelivery extends Delivery {
    private List<String> countries;
    private double acceptableWeight = 100;

    public PlaneDelivery() {
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
        if(this.acceptableWeight > cargo.getWeight() && !Arrays.asList(countries).contains(cargo.getCountry())){
            System.out.println("Cargo will be send by Plane");
        }else{
            super.nextDelivery.deliver(cargo);
        }
    }
}
