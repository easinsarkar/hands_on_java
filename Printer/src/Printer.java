public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ( tonerLevel > -1 && tonerLevel <= 100 ) ? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        if ( tonerAmount > 0 && tonerAmount <= 100) {
            if ( ( tonerAmount + tonerLevel ) > 100 ) {
               return -1;
            } else {
                tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
        return tonerLevel;
    }
    public int printPages( int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages % 2 == 0 ? pagesToPrint / 2 : pagesToPrint / 2 + pagesToPrint % 2;
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
