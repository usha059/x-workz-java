class EVGPS {
    static boolean isEnabled;

    static boolean gpsToggle() {
        if(isEnabled == false) {
            isEnabled = true;
            System.out.println("GPS Enabled");
        } else {
            isEnabled = false;
            System.out.println("GPS Disabled");
        }
        return isEnabled;
    }
}

