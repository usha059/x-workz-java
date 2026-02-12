class EVPower {
    static boolean isOn;

    static boolean powerToggle() {
        if(isOn == false) {
            isOn = true;
            System.out.println("EV Power is ON");
        } else {
            isOn = false;
            System.out.println("EV Power is OFF");
        }
        return isOn;
    }
}

