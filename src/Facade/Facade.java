package Facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mq on 2017-10-09.
 */
public class Facade {
    private List<Fan> fans;

    public Facade() {
        fans = new ArrayList<Fan>();
    }

    public void turnOn(int number){
        fans.get(number).turnOn();
    }

    public void turnOff(int number){
        fans.get(number).turnOff();
    }

    public Fan getFan(int number){
        return fans.get(number);
    }
}
