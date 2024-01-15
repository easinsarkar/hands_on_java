public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() { //default constructor which uses parent Animal Class's base constructor
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled"); //here 'this' is calling its own class's base constructor Dog
    }

    public Dog(String type, double weight, String earShape, String tailShape) { //base constructor for this Dog class
        super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"), // here 'super' is calling parent Animal class's base constructor
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("ow woooooo!");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
    }
    private void bark(){
        System.out.println("Dog barking");
    }
    private void run(){
        System.out.println("Dog running");
    }
    private void walk(){
        System.out.println("Dog walking");
    }
    private void wagTail(){
        System.out.println("Tail wagging");
    }
}
