class HairDryer {
	    static String brand = "Philips";
        static String model = "HP8100/46";
        static int power = 1000;
        static boolean coolAirFeature = true;
        static String color = "Purple";
        static int speedSettings = 2;
        static boolean foldableHandle = true;
        static int warranty = 2;
        static int price = 899;
    public static void main(String[] args) {
        /*String brand = "Philips";
        String model = "HP8100/46";
        int power = 1000;
        boolean coolAirFeature = true;
        String color = "Purple";
        int speedSettings = 2;
        boolean foldableHandle = true;
        int warranty = 2;
        int price = 899;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power (Watts): " + power);
        System.out.println("Cool Air Feature: " + coolAirFeature);
        System.out.println("Color: " + color);
        System.out.println("Speed Settings: " + speedSettings);
        System.out.println("Foldable Handle: " + foldableHandle);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Price (INR): ₹" + price);
    }
}