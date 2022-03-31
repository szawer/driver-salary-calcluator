package Company;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args){
        Company company = new Company();

        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        while (shouldContinue) {
            System.out.println("1. add driver");
            System.out.println("2. display all drivers with info");
            System.out.println("3. exit");

            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> addDriver(company);
                case 2 -> company.displayAllDrivers();
                default -> shouldContinue = false;
            }
        }
    }
    private static void addDriver(Company company) {
        String id = readParam("id");
        String name = readParam("name");
        String kilometers = readParam("kilometers");
        String fuel = readParam("fuel");
        Driver driver = new Driver(Integer.valueOf(id), name, Integer.valueOf(kilometers), Integer.valueOf(fuel));
        company.addDriver(driver);
        driver.getConsumption();
    }
    private static String readParam(String paramName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + paramName +  " : ");
        String value = scanner.nextLine();
        System.out.println("Introduced " + paramName + " : " + value);
        return value;
    }
}

