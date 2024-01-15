public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, long employeeId, String hireDate,String endDate, double hourlyPayRate) {
        super(name, employeeId, hireDate,endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println( name+ " collected doubled Salary ");
    }

    @Override
    public double collectPay(double yearlySalary) {
        getDoublePay();
        return (Integer.parseInt(endDate)-Integer.parseInt(hireDate))*365*hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
