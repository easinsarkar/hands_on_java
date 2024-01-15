public class Main extends Object{
    public static void main (String[] args){
        Student max = new Student("max", 20);
        System.out.println(max.toString());
        primarySchoolStudent jimy = new primarySchoolStudent("jimy", 9,"mark");
        System.out.println(jimy.toString());

    }

}
class Student{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" is "+age;
    }
}
class primarySchoolStudent extends Student{
    private String parentName;

    public primarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return  parentName + "'s kid, " + super.toString();
    }
}