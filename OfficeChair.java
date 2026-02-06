class OfficeChair {
	    static String brand = "Green Soul";
        static String model = "Monster Ultimate Series";
        static String material = "Leatherette";
        static String color = "Black & Red";
        static int maxWeight = 135;
        static boolean adjustableHeight = true;
        static boolean reclineFeature = true;
        static float seatWidth = 21.0F;
        static int warranty = 3;
        static int price = 15999;
    public static void main(String[] args) {
        /*String brand = "Green Soul";
        String model = "Monster Ultimate Series";
        String material = "Leatherette";
        String color = "Black & Red";
        int maxWeight = 135;
        boolean adjustableHeight = true;
        boolean reclineFeature = true;
        float seatWidth = 21.0F;
        int warranty = 3;
        int price = 15999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Max Weight Capacity (kg): " + maxWeight);
        System.out.println("Adjustable Height: " + adjustableHeight);
        System.out.println("Recline Feature: " + reclineFeature);
        System.out.println("Seat Width (inches): " + seatWidth);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Price (INR): ₹" + price);
    }
}