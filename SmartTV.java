class SmartTV {
	    static String brand = "Sony";
        static String model = "Bravia X75L";
        static float screenSize = 55.0F;
        static String displayType = "4K UHD LED";
        static String resolution = "3840 x 2160";
        static String os = "Google TV";
        static int refreshRate = 60;
        static int speakers = 20;
        static float price = 79999F;
        static String color = "Black";
    public static void main(String[] args) {
        /*String brand = "Sony";
        String model = "Bravia X75L";
        float screenSize = 55.0F;
        String displayType = "4K UHD LED";
        String resolution = "3840 x 2160";
        String os = "Google TV";
        int refreshRate = 60;
        int speakers = 20;
        float price = 79999F;
        String color = "Black";*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inch");
        System.out.println("Display Type: " + displayType);
        System.out.println("Resolution: " + resolution);
        System.out.println("Operating System: " + os);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
        System.out.println("Speaker Output: " + speakers + " W");
        System.out.println("Price: ₹" + price);
        System.out.println("Color: " + color);
    }
}
