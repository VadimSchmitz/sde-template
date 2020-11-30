package com.hz;

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

    abstract void printHeaderOrFooter();
    abstract void printMessage();
    abstract void printImage();
}
