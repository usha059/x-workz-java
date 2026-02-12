class EVMusic {
    static boolean isPlaying;

    static boolean musicToggle() {
        if(isPlaying == false) {
            isPlaying = true;
            System.out.println("Music Started");
        } else {
            isPlaying = false;
            System.out.println("Music Stopped");
        }
        return isPlaying;
    }
}

