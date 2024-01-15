public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen(true,false,false);
//
        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getCoffeeMaker().brewCoffee();

        smartKitchen.doKitchenWork();

        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getCoffeeMaker().brewCoffee();

    }
}
