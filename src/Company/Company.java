package Company;

import java.util.HashMap;
import java.util.Scanner;


public class Company {
    HashMap<Integer, Driver> drivers = new HashMap<>();

    public void addDriver(Driver driver){
        drivers.put(driver.getId(),driver);
    }
    public void displayAllDrivers(){
        System.out.println("All drivers: ");
        for (Driver driver : drivers.values()){
            System.out.println(driver);
        }
    }
}



