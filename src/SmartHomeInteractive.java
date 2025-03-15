import java.util.Scanner;

public class SmartHomeInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаём фабрики
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        // Создаём устройства
        SmartDevice light1 = basicFactory.createLight("Living Room");
        SmartDevice thermostat1 = basicFactory.createThermostat("Bedroom");
        SmartDevice advancedLight = advancedFactory.createLight("Office");
        SmartDevice advancedThermostat = advancedFactory.createThermostat("Living Room");

        // Создаём комнату (Composite)
        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(light1);
        livingRoom.addDevice(thermostat1);

        // Декоратор (LoggingDecorator)
        SmartDevice loggedLight = new LoggingDecorator(light1);

        // Фасад (SmartHomeController)
        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(advancedLight);
        controller.addDevice(advancedThermostat);
        controller.addDevice(loggedLight);

        // Адаптер (Legacy Security System)
        LegacySecuritySystem legacySecurity = new LegacySecuritySystem();
        SmartDevice adaptedSecurity = new SecuritySystemAdapter(legacySecurity);
        controller.addDevice(adaptedSecurity);

        // Интерактивное меню
        while (true) {
            System.out.println("\n--- Smart Home Control Menu ---");
            System.out.println("1. Включить все устройства");
            System.out.println("2. Выключить все устройства");
            System.out.println("3. Показать статус системы");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.turnAllOn();
                    break;
                case 2:
                    controller.turnAllOff();
                    break;
                case 3:
                    controller.showSystemStatus();
                    break;
                case 4:
                    System.out.println("Выход из системы умного дома...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}
