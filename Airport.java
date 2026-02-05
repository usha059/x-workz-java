class Airport {
    public static void main(String[] args) {
        String airportName = "International Airport";
        String airportManager = "Mr. Rajan";
        String airportLocation = "Delhi";
        String[] terminals = {"Terminal 1", "Terminal 2", "Terminal 3"};
        String[] staffs = {"John", "Anita", "Kiran"};

        System.out.println("Airport Info");
        System.out.println("Name: " + airportName);
        System.out.println("Manager: " + airportManager);
        System.out.println("Location: " + airportLocation);

        System.out.println("Number of Terminals: " + terminals.length);
        System.out.println("Terminals:");
        for (String terminal : terminals) {
            System.out.println(terminal);
        }

        System.out.println("Number of Staffs: " + staffs.length);
        System.out.println("Staffs:");
        for (String staff : staffs) {
            System.out.println(staff);
        }
    }
}