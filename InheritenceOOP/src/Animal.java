public class Animal { //superclass/parent class

    protected String type;
    private String size;
    private double weight;

    public Animal() { // default constructor other wise super() method will cause compiler error

    }

    public Animal(String type, String size, double weight) {          //main/base constructor
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
