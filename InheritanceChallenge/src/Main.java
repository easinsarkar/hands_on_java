public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("rafiq","2000","2006");
        workerProfile(worker,2000);
        Employee employee = new Employee("easin",12546,"2012","2020");
        workerProfile(employee,5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("ali",12546,"2012","2020",20);
        workerProfile(hourlyEmployee,5000 );
//        hourlyEmployee.getDoublePay();
        SalariedEmployee salariedEmployee = new SalariedEmployee("sarkar",12546,"2012","2020",2000,false);
        workerProfile(salariedEmployee,5000 );




    }
    public static void workerProfile(Worker worker,double yearlySalary){
        System.out.println(worker.name+"'s age is "+worker.getAge());
        worker.terminate(worker.endDate);
        System.out.println(worker.collectPay(yearlySalary));
        System.out.println(worker);
        System.out.println("|______________|");
    }
}
