class SmartBulb {
	    static String brand = "Wipro";
        static String model = "NS9210";
        static int wattage = 9;
        static String color = "RGB + White";
        static boolean wifiEnabled = true;
        static String controlMethod = "App + Voice (Alexa, Google)";
        static int lifespan = 15000;
        static String baseType = "B22";
        static String voltage = "220V";
        static int price = 699;
    public static void main(String[] args) {
        /*String brand = "Wipro";
        String model = "NS9210";
        int wattage = 9;
        String color = "RGB + White";
        boolean wifiEnabled = true;
        String controlMethod = "App + Voice (Alexa, Google)";
        int lifespan = 15000;
        String baseType = "B22";
        String voltage = "220V";
        int price = 699;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Wattage (W): " + wattage);
        System.out.println("Color Options: " + color);
        System.out.println("Wi-Fi Enabled: " + wifiEnabled);
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Lifespan (hours): " + lifespan);
        System.out.println("Base Type: " + baseType);
        System.out.println("Voltage: " + voltage);
        System.out.println("Price (INR): ₹" + price);
    }
}