public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker() { // default constructor other wise super() method will cause compiler error
    }

    public Worker(String name, String birthDate, String endDate) { //base constructor
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
       return 2023-Integer.parseInt(birthDate);
    }
    public double collectPay( double yearlySalary){
        System.out.println( name+ " collected salary");
        return yearlySalary;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println( name+ " terminated his work in "+ endDate );
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
