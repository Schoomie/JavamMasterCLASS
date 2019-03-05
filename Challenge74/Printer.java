package Challenge74;

/**
 * Created by Kuba on 05/03/2019.
 */
public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    boolean duplex;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.tonerLevel = -1;
        this.duplex = duplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public void fillUpTheToner(int a) {
        if (this.tonerLevel + a > 100)
            this.tonerLevel = 100;
        this.tonerLevel = tonerLevel + a;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void printingPage(int b) {
        //ew. duplex
        this.numberOfPagesPrinted += b;
    }

}
