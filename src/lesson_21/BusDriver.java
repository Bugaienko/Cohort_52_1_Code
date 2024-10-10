package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

public class BusDriver {
    private static int idCounter = 1;
    private final int id;

    private String name;
    private String licenseNumber;

    public BusDriver(String name, String licenseNumber) {
        this.id = idCounter++;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver :{");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
