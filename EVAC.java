class EVAC {
    static boolean isRunning;

    static boolean acToggle() {
        if(isRunning == false) {
            isRunning = true;
            System.out.println("AC Started");
        } else {
            isRunning = false;
            System.out.println("AC Stopped");
        }
        return isRunning;
    }
}

