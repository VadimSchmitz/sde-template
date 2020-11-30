package card;
import com.hz.Printer;

public abstract class Card {
    protected Printer printer;

    public Card(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        this.printHeaderOrFooter();
        this.printMessage();
        this.printImage();
        this.printHeaderOrFooter();
    }

    protected abstract void printHeaderOrFooter();
    protected abstract void printMessage();
    protected abstract void printImage();
}
