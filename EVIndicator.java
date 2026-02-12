class EVIndicator {
    static boolean isBlinking;

    static boolean indicatorToggle() {
        if(isBlinking == false) {
            isBlinking = true;
            System.out.println("Indicator ON");
        } else {
            isBlinking = false;
            System.out.println("Indicator OFF");
        }
        return isBlinking;
    }
}

