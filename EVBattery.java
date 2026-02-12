class EVBattery {
    static boolean isCharging;

    static boolean chargeToggle() {
        if(!isCharging) {
            isCharging = true;
            System.out.println("Battery charging started");
        } else {
            isCharging = false;
            System.out.println("Battery charging stopped");
        }
        return isCharging;
    }
}

