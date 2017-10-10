package Facade2;

import Facade.drivers.BrakeDriver;
import Facade.drivers.ElectrocityCommandDriver;
import Facade.drivers.ElectrocityMainDriver;
import Facade.drivers.OilPumpDriver;

/**
 * Created by mq on 2017-10-09.
 */
public class Fan {
    private int fanId;
    private OilPumpDriver oilPumpDriverFirst;
    private OilPumpDriver oilPumpDriverSecond;
    private ElectrocityMainDriver electrocityMainDriver;
    private ElectrocityCommandDriver electrocityCommandDriver;
    private BrakeDriver brakeDriver;

    public Fan(int fanId) {
        this.fanId = fanId;
        this.oilPumpDriverFirst = new OilPumpDriver(1);
        this.oilPumpDriverSecond = new OilPumpDriver(2);
        this.electrocityCommandDriver = new ElectrocityCommandDriver();
        this.electrocityMainDriver = new ElectrocityMainDriver();
        this.brakeDriver = new BrakeDriver();
    }

    public void turnOn(){
        System.out.println("=====> TURNING ON FAN #" + fanId);

        oilPumpDriverFirst.turnOn();
        oilPumpDriverSecond.turnOn();
        brakeDriver.turnOff();
        electrocityMainDriver.turnOn();
        electrocityCommandDriver.turnOn();

        System.out.println("-> Waiting for fan to start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        electrocityCommandDriver.turnOff();
        System.out.println();
    }

    public void turnOff(){
        System.out.println("=====> TURNING OFF FAN #" + fanId);
        electrocityMainDriver.turnOff();
        brakeDriver.turnOn();

        System.out.println("-> Waiting for fan to stop");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oilPumpDriverFirst.turnOff();
        oilPumpDriverSecond.turnOff();
        System.out.println();
    }
}
