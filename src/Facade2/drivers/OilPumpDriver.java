package Facade2.drivers;

/**
 * Created by mq on 2017-10-09.
 */
public class OilPumpDriver {
    private int id;

    public OilPumpDriver(int id) {
        this.id = id;
    }

    public void turnOn(){
        System.out.println("OilPompDriver with id: " + id + " has been turned on");
    }

    public void turnOff(){
        System.out.println("OilPompDriver with id: " + id + " has been turned off");
    }
}
