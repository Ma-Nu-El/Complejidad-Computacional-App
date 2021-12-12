package com.ufrontera.java.Model.ConsoleUtilities;

import com.ufrontera.java.Model.Menu.*;

public class ConsoleUtilities {

    private int spacesPerTab = 4;
    private String space = " ";
    private String tab = "";

    // Create elements of console
    private void createTab() {
        String tab="";
        for (int i = 0; i < spacesPerTab; i++) {
            tab = tab + space;
        }
        this.tab=tab;
    }

    public String getTab(){
        return this.tab;
    }

    public String getTab(int numberOfTabs){
        String outputTab = "";
        for (int i = 0; i < numberOfTabs; i++) {
            outputTab=outputTab+this.tab;
        }
        return outputTab;
    }

    public String getTitleIndent() {
        int titleIndentLevel = 4;
        String titleIndent = "";

        for (int i = 0; i < titleIndentLevel; i++) {
            titleIndent = titleIndent + getTab();
        }
        return titleIndent;
    }

    public String getSubTitleIndent() {
        int subtitleIndentLevel = 6;
        String subTitleIndent = "";

        for (int i = 0; i < subtitleIndentLevel; i++) {
            subTitleIndent = subTitleIndent + getTab();
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
        String subjectMessage = "Complejidad Computacional";
        String projectMessage = "Proyecto Final";
        System.out.println(getTitleIndent()+ subjectMessage);
        System.out.println(getSubTitleIndent()+ projectMessage);
        printHline();
    }
    public void printMenu(){
        Menu menu = new Menu();
        int menuIndentation = 2;

        menu.displayMenu(getTab(menuIndentation));

    }

    public void initConsole(){
        createTab();
    }
}
