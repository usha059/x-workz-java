class Headphones {
	    static String brand = "Sony";
        static String model = "WH-1000XM4";
        static String type = "Over Ear";
        static String noiseCancellation = "Active Noise Cancellation";
        static int battery = 30;
        static String connectivity = "Bluetooth 5.0";
        static String assistant = "Alexa & Google";
        static String color = "Black";
        static float price = 24999F;
        static String warranty = "1 Year";
    public static void main(String[] args) {
        /*String brand = "Sony";
        String model = "WH-1000XM4";
        String type = "Over Ear";
        String noiseCancellation = "Active Noise Cancellation";
        int battery = 30;
        String connectivity = "Bluetooth 5.0";
        String assistant = "Alexa & Google";
        String color = "Black";
        float price = 24999F;
        String warranty = "1 Year";*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Noise Cancellation: " + noiseCancellation);
        System.out.println("Battery Life: " + battery + " hrs");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Voice Assistant: " + assistant);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warranty);
    }
}
