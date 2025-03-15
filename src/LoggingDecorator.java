public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Logging: Turning on " + device.getStatus());
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logging: Turning off " + device.getStatus());
        super.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus() + " (with Logging)";
    }
}
