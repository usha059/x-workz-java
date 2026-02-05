class FireStation {
    public static void main(String[] args) {
        String stationName = "Downtown Fire Station";
        String chief = "Chief Raghavan";
        String stationAddress = "Pune";
        String[] vehicles = {"Fire Truck", "Rescue Van", "Ambulance"};
        String[] firefighters = {"Arjun", "Vikram", "Nisha"};

        System.out.println(Fire Station Info");
        System.out.println("Name: " + stationName);
        System.out.println("Chief: " + chief);
        System.out.println("Address: " + stationAddress);

        System.out.println("Number of Vehicles: " + vehicles.length);
        System.out.println("Vehicles:");
        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Number of Firefighters: " + firefighters.length);
        System.out.println("Firefighters:");
        for (String firefighter : firefighters) {
            System.out.println(firefighter);
        }
    }
}