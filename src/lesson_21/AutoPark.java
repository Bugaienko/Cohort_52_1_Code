package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-19945395");


        Autobus bus = new Autobus(busDriver,15);


        BusDriver busDriver1 = new BusDriver("Margo", "AE-54565655");
        Autobus bus1 = new Autobus(busDriver1, 24);

        System.out.println("bus: " + bus.toString());
        System.out.println("bus1: " + bus1.toString());

        BusDriver peter = new BusDriver("Peter", "PE-45878889");
        bus1.setDriver(peter);
        System.out.println("bus1: " + bus1.toString());

        bus1 = null;

        System.out.println(peter.toString());

        bus.installNewAutopilot("AP-gpt6");
        System.out.println(bus.toString());
        busDriver.setName("Sebastian");
        System.out.println(bus.toString());

        System.out.println("\n============================");
        System.out.println("количество пассажиров в автобусе: " + bus.getCountPassenger());
        bus.showListOfPassengers();

        Passenger passenger = new Passenger("John");
        Passenger margo = new Passenger("Margo");

        bus.takePassenger(passenger);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showListOfPassengers();
        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showListOfPassengers();




    }
}
