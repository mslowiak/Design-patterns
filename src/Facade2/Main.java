package Facade2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by mq on 2017-10-09.
 */
public class Main {
    public static void main(String[] args) {
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan(1));
        fans.add(new Fan(2));

        Facade facade = new Facade(fans);
        facade.turnOn(0);
        facade.turnOn(1);
        facade.turnOff(1);
        facade.turnOff(0);
    }
}
