class Camera {
	    static String brand = "Canon";
        static String model = "EOS 1500D";
        static int megapixels = 24;
        static String sensor = "APS-C CMOS";
        static String lens = "18-55mm";
        static String video = "Full HD";
        static String connectivity = "WiFi + NFC";
        static String color = "Black";
        static float price = 38999F;
        static String warranty = "2 Years";
    public static void main(String[] args) {
        /*String brand = "Canon";
        String model = "EOS 1500D";
        int megapixels = 24;
        String sensor = "APS-C CMOS";
        String lens = "18-55mm";
        String video = "Full HD";
        String connectivity = "WiFi + NFC";
        String color = "Black";
        float price = 38999F;
        String warranty = "2 Years";*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + megapixels + " MP");
        System.out.println("Sensor Type: " + sensor);
        System.out.println("Lens: " + lens);
        System.out.println("Video Recording: " + video);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warranty);
    }
}
