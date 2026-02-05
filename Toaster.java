class Toaster {
	    static String brand = "Bajaj";
        static String model = "ATX 4";
        static int slices = 2;
        static int power = 750;
        static String color = "White";
        static boolean reheatFunction = true;
        static boolean removableTray = true;
        static int warranty = 2;
        static int price = 1899;
    public static void main(String[] args) {
        /*String brand = "Bajaj";
        String model = "ATX 4";
        int slices = 2;
        int power = 750;
        String color = "White";
        boolean reheatFunction = true;
        boolean removableTray = true;
        int warranty = 2;
        int price = 1899;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Slices: " + slices);
        System.out.println("Power (Watts): " + power);
        System.out.println("Color: " + color);
        System.out.println("Reheat Function: " + reheatFunction);
        System.out.println("Removable Tray: " + removableTray);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Price (INR): ₹" + price);
    }
}