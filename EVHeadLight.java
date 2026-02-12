class EVHeadLight {
    static boolean isOn;

    static boolean lightToggle() {
        if(isOn == false) {
            isOn = true;
            System.out.println("Headlights turned ON");
        } else {
            isOn = false;
            System.out.println("Headlights turned OFF");
        }
        return isOn;
    }
}

