package Facade;

/**
 * Created by mq on 2017-10-09.
 */
public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan(1);
        Fan fan2 = new Fan(2);
        fan.turnOn();
        fan2.turnOn();
        fan2.turnOff();
        fan.turnOff();
    }
}
