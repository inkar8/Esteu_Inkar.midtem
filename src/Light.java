public class Light implements SmartDevice {
    private String name;
    private boolean isOn;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " Light is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " Light is OFF");
    }

    @Override
    public String getStatus() {
        return name + " Light: " + (isOn ? "ON" : "OFF");
    }
}
