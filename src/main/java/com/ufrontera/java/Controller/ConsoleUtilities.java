package com.ufrontera.java.Controller;

public class ConsoleUtilities {

    private int spacesPerTab = 8;
    // private String tab = "";
    private String space = " ";

    // Create elements of console
    public String createTab() {
        String tab="";
        for (int i = 0; i < spacesPerTab; i++) {
            tab = tab + space;
        }
        return tab;
    }

    public String getTitleIndent() {
        int titleIndentLevel = 2;
        String titleIndent = "";

        for (int i = 0; i < titleIndentLevel; i++) {
            titleIndent = titleIndent + createTab();
        }
        return titleIndent;
    }

    public String getSubTitleIndent() {
        int subtitleIndentLevel = 3;
        String subTitleIndent = "";

        for (int i = 0; i < subtitleIndentLevel; i++) {
            subTitleIndent = subTitleIndent + createTab();
        }
        return subTitleIndent;
    }

    public String getHline() {
        // https://stackoverflow.com/questions/39584129/concatenate-string-through-for-loop
        String hline = "";
        String hlineChar = "-";
        int hlineWidth = (spacesPerTab * 7); // each tab is 8 chars

        for (int i = 0; i < hlineWidth; i++) {
            hline = hline + hlineChar;
        }

        return hline;
    }

    public void printHline() {
        System.out.println(getHline());
    }

    public void printIntro() {
        printHline();
        System.out.println(getTitleIndent()+ "Complejidad Computacional");
        System.out.println(getSubTitleIndent()+ "Proyecto Final");
        printHline();
    }

    public void initConsole(){
        createTab();
    }
}
