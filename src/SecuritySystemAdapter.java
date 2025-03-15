public class SecuritySystemAdapter implements SmartDevice {
    private LegacySecuritySystem legacySystem;

    public SecuritySystemAdapter(LegacySecuritySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void turnOn() {
        legacySystem.activate();
    }

    @Override
    public void turnOff() {
        legacySystem.deactivate();
    }

    @Override
    public String getStatus() {
        return "Security System (Adapter)";
    }
}
