public class SmartHomeDemo {
    public static void main(String[] args) {
        // Создаём фабрики
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        // Создаём устройства через фабрику
        SmartDevice light1 = basicFactory.createLight("Living Room");
        SmartDevice thermostat1 = basicFactory.createThermostat("Bedroom");
        SmartDevice advancedLight = advancedFactory.createLight("Office");
        SmartDevice advancedThermostat = advancedFactory.createThermostat("Living Room");

        // Создаём комнату и добавляем устройства (Composite)
        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(light1);
        livingRoom.addDevice(thermostat1);

        // Используем декоратор (LoggingDecorator)
        SmartDevice loggedLight = new LoggingDecorator(light1);

        // Создаём фасад (SmartHomeController)
        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(advancedLight);
        controller.addDevice(advancedThermostat);
        controller.addDevice(loggedLight);

        // Интеграция с устаревшей системой (Adapter)
        LegacySecuritySystem legacySecurity = new LegacySecuritySystem();
        SmartDevice adaptedSecurity = new SecuritySystemAdapter(legacySecurity);
        controller.addDevice(adaptedSecurity);

        // Демонстрация работы системы
        System.out.println("\n--- Smart Home Demo ---\n");
        controller.turnAllOn();
        controller.showSystemStatus();
        controller.turnAllOff();
    }
}
