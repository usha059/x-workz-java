class EVDoorLockExecutor {
    public static void main(String[] args) {
        boolean ref = EVDoorLock.lockToggle();
        System.out.println("Door lock status: " + ref);
    }
}
