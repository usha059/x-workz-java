class AirPurifier {
	    static String brand = "Dyson";
        static String model = "TP09";
        static String type = "Tower Air Purifier";
        static float coverageArea = 600.0F;
        static boolean hepaFilter = true;
        static boolean wifiEnabled = true;
        static String color = "White/Silver";
        static int power = 40;
        static String noiseLevel = "Quiet Mode 30dB";
        static int price = 45900;
    public static void main(String[] args) {
        /*String brand = "Dyson";
        String model = "TP09";
        String type = "Tower Air Purifier";
        float coverageArea = 600.0F;
        boolean hepaFilter = true;
        boolean wifiEnabled = true;
        String color = "White/Silver";
        int power = 40;
        String noiseLevel = "Quiet Mode 30dB";
        int price = 45900;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Coverage Area (sq ft): " + coverageArea);
        System.out.println("HEPA Filter: " + hepaFilter);
        System.out.println("Wi-Fi Enabled: " + wifiEnabled);
        System.out.println("Color: " + color);
        System.out.println("Power (Watts): " + power);
        System.out.println("Noise Level: " + noiseLevel);
        System.out.println("Price (INR): ₹" + price);
    }
}