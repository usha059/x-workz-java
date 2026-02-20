class DominosExecutor {
    public static void main(String[] args){
        String foodName = "delux veggie";
        double price = UberEats.search(foodName);
        System.out.println("The price of " + foodName + " is: " + price);
    }
}