public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        return new LoggingDecorator(new Light(name)); // Добавляем логирование
    }

    @Override
    public SmartDevice createThermostat(String name) {
        Thermostat thermostat = new Thermostat(name);
        return thermostat;
    }
}
