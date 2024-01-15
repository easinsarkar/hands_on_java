public class SmartKitchen {
    private DishWasher dishWasher;
    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(boolean dishWasher, boolean refrigerator, boolean coffeeMaker) {
        this.dishWasher = new DishWasher(dishWasher);
        this.refrigerator = new Refrigerator(refrigerator);
        this.coffeeMaker = new CoffeeMaker(coffeeMaker);
    }
    private void addWater(){
        this.coffeeMaker =new CoffeeMaker(true);
        System.out.println("water added into coffee maker");

    }
    private void pourMilk(){
        this.refrigerator = new Refrigerator(true);
        System.out.println("milk is poured into refrigerator");
    }
    private void loadDishwasher(){
        this.dishWasher = new DishWasher(true);
        System.out.println("dishes are added into dishwasher");
    }
    public void doKitchenWork(){
        System.out.println("\n------------all IoT devices are in process------------");
        addWater();
        pourMilk();
        loadDishwasher();
        System.out.println("------------all IoT devices have done working----------\n");
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}



class DishWasher{
    private boolean hasWorkToDo;
    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("dishwasher is cleaning the used dishes");
        }else {
            System.out.println("not working");
        }
    }
}
class Refrigerator{
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("food is ordered");
        }else {
            System.out.println("not working");
        }
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("coffee is making");
        }else {
            System.out.println("not working");
        }
    }
}
