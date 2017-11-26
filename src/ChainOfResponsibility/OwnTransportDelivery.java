package ChainOfResponsibility;

import java.util.ArrayList;

public class OwnTransportDelivery extends Delivery{
    private ArrayList<String> countries;

    public OwnTransportDelivery() {
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
        if(countries.contains(cargo.getCountry())){
            System.out.println("Cargo will be send by Own Transport");
        }else{
            super.nextDelivery.deliver(cargo);
        }
    }
}
