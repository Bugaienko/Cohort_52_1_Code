package lesson_21;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

public class Autopilot {
    private String softwareVersion;
    private Autobus autobus;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String toString() {
        return "Autopilot: { SV: " + softwareVersion + "}";
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
