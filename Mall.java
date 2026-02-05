class Mall {
    public static void main(String[] args) {
        String mallName = "Sunshine Mall";
        String mallOwner = "Mr. Kapoor";
        String mallAddress = "Bangalore";
        String[] shops = {"Clothing", "Electronics", "Food Court", "Books"};
        String[] managers = {"Rita", "Suresh", "Vikram"};

        System.out.println("Mall Info");
        System.out.println("Name: " + mallName);
        System.out.println("Owner: " + mallOwner);
        System.out.println("Address: " + mallAddress);

        System.out.println("Number of Shops: " + shops.length);
        System.out.println("Shops:");
        for (String shop : shops) {
            System.out.println(shop);
        }

        System.out.println("Number of Managers: " + managers.length);
        System.out.println("Managers:");
        for (String manager : managers) {
            System.out.println(manager);
        }
    }
}