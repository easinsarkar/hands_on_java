public class Employee extends Worker{
    private long employeeId;
    protected String hireDate;

    public Employee() {         //default constructor which uses parent Worker Class's base constructor
        super("easin","2000","2020");
    }
    public Employee( String name,long employeeId, String hireDate,String endDate){ //base constructor for this Employee class
        super( name,"1980",endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public double collectPay(double yearlySalary) {
        return (super.collectPay(yearlySalary))*(Integer.parseInt(endDate)-Integer.parseInt(hireDate));
    }

    public void collectPay(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
