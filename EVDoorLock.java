class EVDoorLock {
    static boolean isLocked;

    static boolean lockToggle() {
        if(isLocked == false) {
            isLocked = true;
            System.out.println("Doors Locked");
        } else {
            isLocked = false;
            System.out.println("Doors Unlocked");
        }
        return isLocked;
    }
}

