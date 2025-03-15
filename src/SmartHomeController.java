import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Turning all devices ON...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning all devices OFF...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showSystemStatus() {
        System.out.println("Smart Home Status Report:");
        for (SmartDevice device : devices) {
            System.out.println("- " + device.getStatus());
        }
    }
}
