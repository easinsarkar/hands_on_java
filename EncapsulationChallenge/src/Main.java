public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(0,0,false);
        System.out.println("toner level is "+ printer.addToner(50)+"%");
        printer.printPages(15);
    }
}
