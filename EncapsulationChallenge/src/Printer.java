public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if (tonerLevel>100){
            tonerLevel = 100;
        } else if (tonerLevel<0) {
            tonerLevel = 0;
        } else {
            tonerLevel = tonerLevel+tonerAmount;
        }
        if ( tonerLevel>100 || tonerLevel < 0 ){
            return -1;
        }else {
            return tonerLevel;
        }
    }
    public void printPages(int pages){
        int sheets;
        if (duplex){
            sheets = pages/2 + pages%2;
            System.out.println("it is a duplex printer");
        }else{
            sheets = pages;
        }
        pagesPrinted = pagesPrinted + pages;
        System.out.println("total sheets of paper will be printed "+ sheets);
        System.out.println("total pages were printed "+pagesPrinted);

    }
}
