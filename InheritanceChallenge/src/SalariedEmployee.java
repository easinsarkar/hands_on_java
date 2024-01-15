public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;



    public SalariedEmployee(String name, long employeeId, String hireDate,String endDate, double annualSalary, boolean isRetired) { //base constructor for class SalariedEmployed
        super(name, employeeId, hireDate,endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public void salary(){
        System.out.println("total salary ");
    }
    @Override
    public double collectPay(double yearlySalary) {
        this.retire();
        salary();
        return annualSalary*(Integer.parseInt(endDate)-Integer.parseInt(hireDate));
    }


    public void retire(){
        if (getAge()>60 || isRetired) {
            System.out.println(name + " is retired");
            isRetired = true;
        }
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
