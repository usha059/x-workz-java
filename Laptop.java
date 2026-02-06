class Laptop {
	    static String brand = "HP";
        static String model = "Pavilion 15";
        static String processor = "Intel Core i5";
        static int ram = 16;
        static int storage = 512;
        static String storageType = "SSD";
        static float displaySize = 15.6F;
        static String color = "Silver";
        static int batteryLife = 8;
        static int price = 62999;
    public static void main(String[] args) {
        /*String brand = "HP";
        String model = "Pavilion 15";
        String processor = "Intel Core i5";
        int ram = 16;
        int storage = 512;
        String storageType = "SSD";
        float displaySize = 15.6F;
        String color = "Silver";
        int batteryLife = 8;
        int price = 62999;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM (GB): " + ram);
        System.out.println("Storage (GB): " + storage + " " + storageType);
        System.out.println("Display Size (inches): " + displaySize);
        System.out.println("Color: " + color);
        System.out.println("Battery Life (hours): " + batteryLife);
        System.out.println("Price (INR): ₹" + price);
    }
}