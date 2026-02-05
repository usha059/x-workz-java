class Theatre {
    public static void main(String[] args) {
        String theatreName = "PVR Cinemas";
        String theatreOwner = "INOX Group";
        String theatreAddress = "Bangalore";
        String screens[] = {"Screen 1", "Screen 2", "Screen 3"};
        String managers[] = {"Ramesh", "Suresh", "Mahesh"};

        System.out.println("The Theatre info is:");
        System.out.println("The name of Theatre is " + theatreName);
        System.out.println("The owner of Theatre is " + theatreOwner);
        System.out.println("The address of Theatre is " + theatreAddress);

        System.out.println("The number of screens is " + screens.length);
        System.out.println("The list of screens available are:");
        for (String screen : screens) {
            System.out.println(screen);
        }

        System.out.println("The number of managers is " + managers.length);
        System.out.println("The managers available are:");
        for (String manager : managers) {
            System.out.println(manager);
        }
    }
}
