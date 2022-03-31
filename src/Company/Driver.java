package Company;

import java.util.Locale;

public class Driver {
    private int id; //drivers id
    private String name; // drivers name
    private final int majorSalary = 3010; // major brutto salary
    private int kilometers; // drivers number of kilometers driven last month
    private int fuel; // drivers number of fuel taken last month
    private float consumption; // final consumption for truck lasth month
    private final float salaryRate = 0.40f; // rate for each kilometer driven


    public Driver(int id, String name, int kilometers, int fuel) {
        this.id = id;
        this.name = name;
        this.kilometers = kilometers;
        this.fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getFuel() {
        return fuel;
    }

    public int getMajorSalary() {
        return majorSalary;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "id = " + id +
                ", name = '" + name.toUpperCase(Locale.ROOT) + '\'' +
                ", kilometers = " + kilometers +
                ", fuel = " + fuel +
                ", consumption = " + getConsumption() +
                ", finalSalary = " + getMainSalary() + " PLN" +
                '}';
    }



    public float getConsumption(){
        float fuelConsumption = (float) fuel / (float) kilometers * 100;
        return  Math.round(fuelConsumption);

    }


    public float getMainSalary(){
        float lastSalary = (float) majorSalary + getKilometers() * salaryRate;
        return lastSalary;
    }

}