class EVRegenBraking {
    static boolean isActive;

    static boolean regenToggle() {
        if(isActive == false) {
            isActive = true;
            System.out.println("Regenerative Braking Activated");
        } else {
            isActive = false;
            System.out.println("Regenerative Braking Deactivated");
        }
        return isActive;
    }
}

