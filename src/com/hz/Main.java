package com.hz;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        PostCard postCard = new PostCard(printer);
        HighschoolGraduationCard hsgCard = new HighschoolGraduationCard(printer);
        ChristmasCard christmasCard = new ChristmasCard(printer);

        postCard.print();
        hsgCard.print();
        christmasCard.print();
    }
}
