package card;

import card.Card;
import com.hz.Printer;

public class ChristmasCard extends Card {
    public ChristmasCard(Printer printer) {
        super(printer);
    }

    protected void printHeaderOrFooter() {
        String line = ".:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:.";
        this.printer.printLine(line);
    }

    protected void printMessage() {
        String message = "Happy holidays!";
        this.printer.printLine(message);
    }

    protected void printImage() {
        this.printer.printLine("     *");
        this.printer.printLine("    /.\\");
        this.printer.printLine("   /..'\\");
        this.printer.printLine("   /'.'\\ ");
        this.printer.printLine("  /.''.'\\  ");
        this.printer.printLine("  /.'.'.\\ ");
        this.printer.printLine(" /'.''.'.\\  ");
        this.printer.printLine(" ^^^[_]^^^  ");
    }
}