package homework_21.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */

public class ComputerApp {
    public static void main(String[] args) {

        Storage storage = new Storage("WD", "WD-1000");
        Storage storage1 = new Storage("Gnusmas", "SA-500");

        System.out.println(storage1.toString());

        Computer computer = new Computer("LEN-5100", storage);

        System.out.println(computer.toString());

        computer.setStorage(storage1);

        System.out.println(computer.toString());

        System.out.println(computer.getProcessor().toString());

        System.out.println("computer.getStorage().getBrand(): " + computer.getStorage().getBrand().toString());

       // computer = null;

        System.out.println(storage1.toString());

        System.out.println("\n ============= ");

        Storage storageFromPC = computer.getStorage();
        System.out.println(storageFromPC.toString());

        String brandStorage = storageFromPC.getBrand();
        String modelStorage = storageFromPC.getModel();

        System.out.println("brandStorage: " + brandStorage);
        System.out.println("modelStorage: " + modelStorage);

        computer.showProcessorModel();


    }
}
