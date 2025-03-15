public class Thermostat implements SmartDevice {
    private String name;
    private double temperature;

    public Thermostat(String name) {
        this.name = name;
        this.temperature = 22.0; // Температура по умолчанию
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(name + " Thermostat set to " + temperature + "°C");
    }

    @Override
    public void turnOn() {
        System.out.println(name + " Thermostat is active");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " Thermostat is inactive");
    }

    @Override
    public String getStatus() {
        return name + " Thermostat: " + temperature + "°C";
    }
}
