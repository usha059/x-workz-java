class CoffeeMaker {
	    static String brand = "Morphy Richards";
        static int capacity = 4;
        static int power = 800;
        static String color = "Black";
        static boolean dripTray = true;
        static int warranty = 2;
        static int price = 4999;
    public static void main(String[] args) {
        /*String brand = "Morphy Richards";
        String model = "New Europa";
        int capacity = 4;
        int power = 800;
        String color = "Black";
        boolean steamNozzle = true;
        boolean dripTray = true;
        int warranty = 2;
        int price = 4999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity (cups): " + capacity);
        System.out.println("Power (Watts): " + power);
        System.out.println("Color: " + color);
        System.out.println("Steam Nozzle: " + steamNozzle);
        System.out.println("Drip Tray: " + dripTray);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Price (INR): ₹" + price);
    }
}