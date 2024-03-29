package com.kv.javabasics.challenges.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            // that trick allows count real amount pages, computer doesn't rounds to up (in this case 1 / 2 = 1 and 3 / 2 = 1, so ((1+1) / 2 = 1) and ((3+1) / 2 = 2))
            pagesToPrint = (pagesToPrint + 1) / 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


    public static void main(String[] args) {
        Printer printer = new Printer(-1,  false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(7);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());

//        Printer printer2 = new Printer(-1,  true);
//        pagesPrinted = printer2.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
//        pagesPrinted = printer2.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());

    }
}