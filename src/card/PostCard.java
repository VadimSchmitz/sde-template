package card;

import card.Card;
import com.hz.Printer;

public class PostCard extends Card {
    public PostCard(Printer printer) {
        super(printer);
    }

    protected void printHeaderOrFooter() {
        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        this.printer.printLine(header);
    }

    protected void printMessage() {
        String message = "Greetings from the netherlands!";
        this.printer.printLine(message);
    }

    protected void printImage() {
        this.printer.printLine("        Art by Hayley Jane Wakenshaw");
        this.printer.printLine("");
        this.printer.printLine("             /)  (\\");
        this.printer.printLine("        .-._((,~~.))_.-,");
        this.printer.printLine("         `=.   99   ,='");
        this.printer.printLine("           / ,o~~o. \\");
        this.printer.printLine("          { { .__. } }");
        this.printer.printLine("           ) `~~~\' (");
        this.printer.printLine("          /`-._  _\\.-\\");
        this.printer.printLine("         /         )  \\");
        this.printer.printLine("       ,-X        #   X-.");
        this.printer.printLine("hjw   /   \\          /   \\");
        this.printer.printLine("     (     )| |  | |(     )");
        this.printer.printLine("      \\   / | |  | | \\   /");
        this.printer.printLine("       \\_(.-( )--( )-.)_/");
        this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
        this.printer.printLine("           /_,\\  /._\\");
    }
}