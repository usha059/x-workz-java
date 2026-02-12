class EVMotor {
    static boolean isActive;

    static boolean motorToggle() {
        if(isActive == false) {
            isActive = true;
            System.out.println("Motor Activated");
        } else {
            isActive = false;
            System.out.println("Motor Deactivated");
        }
        return isActive;
    }
}

