package lesson_20.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 09.10.2024
 */

public class TransportApp {
    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 10);

        String str = bus.toString();
        System.out.println(str);

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println("\n======================");

        Train train = new Train("Skoda", 2022, 40, 4);

        System.out.println(train.toString());
        train.start();

        System.out.println(train.getModel());

        System.out.println("Capacity: " + train.getCapacity());
        train.setCountWagons(3);
        System.out.println("Capacity: " + train.getCapacity());

        System.out.println("\n ===================");

        Bus bus1 = new Bus("Bus-X2", 2024, 3);
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());
        System.out.println("=============");
        System.out.println(bus1.takePassenger());

        System.out.println("\nbus1.getCountPassengers(): " + bus1.getCountPassengers());

        System.out.println("\n ==================");
        System.out.println(bus1.dropPassenger());
        System.out.println("=================");
        System.out.println(bus1.dropPassenger());
        System.out.println("=================");
        System.out.println(bus1.dropPassenger());
        System.out.println("=================");
        System.out.println(bus1.dropPassenger());
        System.out.println("=================");

        System.out.println("bus1.getCountPassengers(): " + bus1.getCountPassengers());



    }
}
