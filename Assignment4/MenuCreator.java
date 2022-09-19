package Assignment4;

import java.util.Scanner;

public class MenuCreator {

    Scanner sc = new Scanner(System.in);

    TrayCreator trayCreator = new TrayCreator();
    Tray subjectsTray = trayCreator.createFolders();

    public void printMenu() {
        System.out.println();
        System.out.println("----------------Menu-----------------");
        System.out.println("1. Print Folder Names.");
        System.out.println("2. Print File Hash-Map");
        System.out.println("3. Check Existence of a Folder.");
        System.out.println("4. Print Details of a Certain Folder.");
        System.out.println("5. Print Details of All Folders.");
        System.out.println("6. Print details of top most folder.");
        System.out.println("7. Remove most-recently-added Folder.");
        System.out.println("8. Check Existence of a File.");
        System.out.println("9. Print Details of a Certain File.");
        System.out.println("10. Print Details of All Files.");
        System.out.println("11. Exit Program");
        System.out.println();
        System.out.print("Select an option : ");
    }

    public String enterFolderName(){
        System.out.print("Enter folder name : ");
        return sc.nextLine();
    }
    public void menuSearchFile(){
        System.out.println("1. Search File by Number");
        System.out.println("2. Search File by Name");
        System.out.print("Select an Option : ");
    }
    public int enterFileNumber(){
        System.out.print("Enter File Number : ");
        return sc.nextInt();
    }
    public String enterFileName(){
        System.out.print("Enter File Name : ");
        sc.nextLine();
        return sc.nextLine();
    }

    public void enterFileMenu1(){
        menuSearchFile();
        try {
            int option1 = sc.nextInt();
            switch (option1) {
                case 1 -> {
                    subjectsTray.searchFileByNumber(enterFileNumber());
                    sc.nextLine();
                }
                case 2 -> subjectsTray.searchFileByName(enterFileName());
                default -> System.out.println("Enter valid input");
            }
        }
        catch (Exception e){
            System.out.println("Enter a valid input");
            sc.nextLine();
        }
    }

    public void enterFileMenu2(){
        menuSearchFile();
        try {
            int option2 = sc.nextInt();
            switch (option2) {
                case 1 -> {
                    subjectsTray.printFileByNumber(enterFileNumber());
                    sc.nextLine();
                }
                case 2 -> subjectsTray.printFileByName(enterFileName());
                default -> {
                    System.out.println("Enter valid input ");
                    sc.nextLine();
                }
            }
        }
        catch(Exception e){
            System.out.println("Enter valid input");
            sc.nextLine();
        }
    }

    public boolean endProgramOrNot(){
        boolean endOrNot = true;
        boolean yesOrNo = true;
        while(yesOrNo){
            System.out.print("Do you want to continue? (y/n) : ");
            String input = sc.nextLine();

            switch (input) {
                case "y" -> yesOrNo = false;
                case "n" -> {
                    endOrNot = false;
                    yesOrNo = false;
                    System.out.println("EXITING PROGRAM");
                }
                default -> System.out.println("Enter a valid input");
            }
        }
        return endOrNot;
    }
    
    public boolean exitProgramme(){
        System.out.println("EXITING PROGRAM");
        return false;
    }

    public void executeProgram() {
        try {
            boolean continueProgram = true;

                while (continueProgram){
                    printMenu();
                    int option = sc.nextInt();
                    sc.nextLine();
                    System.out.println("--------------------");

                    switch (option) {
                        case 1 -> subjectsTray.printFolderNames();
                        case 2 -> subjectsTray.printFileHashMap();
                        case 3 -> subjectsTray.searchFolderByName(enterFolderName());
                        case 4 -> subjectsTray.printFolder(enterFolderName());
                        case 5 -> subjectsTray.printFolders();
                        case 6 -> subjectsTray.printTopFolder();
                        case 7 -> subjectsTray.removeFolder();
                        case 8 -> enterFileMenu1();
                        case 9 -> enterFileMenu2();
                        case 10 -> subjectsTray.printFiles();
                        case 11 -> continueProgram = exitProgramme();
                        default -> System.out.println("Enter a valid input");
                    }
                    if(option!=11){
                        continueProgram = endProgramOrNot();
                    }
                }
            }

        catch (Exception e) {
                System.out.println("Enter a valid input");
        }

    }

}
