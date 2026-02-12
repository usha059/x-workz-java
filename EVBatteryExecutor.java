class EVBatteryExecutor {
    public static void main(String[] args) {
        boolean ref = EVBattery.chargeToggle();
        System.out.println("Battery charging status: " + ref);
    }
}
