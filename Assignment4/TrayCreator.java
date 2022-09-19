package Assignment4;

public class TrayCreator {

    /*
    1. create 5 folders
    2. create 2 files for each folder and insert them to folders
    3. insert folders to tray (stack)
    4. all the operations will be done using this tray
    */

    public Tray createFolders () {

        Tray subjectsFolderStack = new Tray("Subjects");

        // Science Subject
        Folder science = new Folder("Science", "10-03-2022","Science Teacher", FileType.PDF); // 10-03-2022
        File scienceFile1 = new File(101, "Heat", "11-03-2022", "content1");
        File scienceFile2 = new File(102, "Power", "11-03-2022", "content2");

        science.addFileToFolder(scienceFile1);
        science.addFileToFolder(scienceFile2);

        scienceFile1.addToFileHashMap(scienceFile1.getFileNumber(), scienceFile1.getFileName());
        scienceFile2.addToFileHashMap(scienceFile2.getFileNumber(), scienceFile2.getFileName());

        // Maths Subject
        Folder maths = new Folder("Maths", "12-04-2022", "Maths Teacher", FileType.DOCX);
        File mathsFile1 = new File(103, "Integration", "13-04-2022", "content3");
        File mathsFile2 = new File(104, "Matrices", "14-04-2022", "content4");

        maths.addFileToFolder(mathsFile1);
        maths.addFileToFolder(mathsFile2);

        mathsFile1.getFileHashMap().put(mathsFile1.getFileNumber(), mathsFile1.getFileName());
        mathsFile2.getFileHashMap().put(mathsFile2.getFileNumber(), mathsFile2.getFileName());

        mathsFile1.addToFileHashMap(mathsFile1.getFileNumber(), mathsFile1.getFileName());
        mathsFile2.addToFileHashMap(mathsFile2.getFileNumber(), mathsFile2.getFileName());

        // Statistics Subject
        Folder statistics = new Folder("Statistics", "03-01-2022", "Statistics Teacher", FileType.XLX);
        File statisticsFile1 = new File(105, "Probability", "04-01-2022", "content5");
        File statisticsFile2 = new File(106, "Distributions", "05-01-2022", "content6");

        statistics.addFileToFolder(statisticsFile1);
        statistics.addFileToFolder(statisticsFile2);

        statisticsFile1.addToFileHashMap(statisticsFile1.getFileNumber(), statisticsFile1.getFileName());
        statisticsFile2.addToFileHashMap(statisticsFile2.getFileNumber(), statisticsFile2.getFileName());



        // ComputerScience Subject
        Folder computerScience = new Folder("ComputerScience", "19-08-2022", "ComputerScience Teacher", FileType.JPEG);
        File computerScienceFile1 = new File(107, "Java", "20-08-2022", "content7");
        File computerScienceFile2 = new File(108, "Python", "21-08-2022", "content8");

        computerScience.addFileToFolder(computerScienceFile1);
        computerScience.addFileToFolder(computerScienceFile2);

        computerScienceFile1.addToFileHashMap(computerScienceFile1.getFileNumber(), computerScienceFile1.getFileName());
        computerScienceFile2.addToFileHashMap(computerScienceFile2.getFileNumber(), computerScienceFile2.getFileName());

        // English Subject
        Folder english = new Folder("English", "23-06-2022", "English Teacher", FileType.TXT);
        File englishFile1 = new File(109, "Essays", "24-06-2022", "content9");
        File englishFile2 = new File(110, "Reading", "25-06-2022", "content10");

        english.addFileToFolder(englishFile1);
        english.addFileToFolder(englishFile2);

        englishFile1.getFileHashMap().put(englishFile1.getFileNumber(), englishFile1.getFileName());
        englishFile2.getFileHashMap().put(englishFile2.getFileNumber(), englishFile2.getFileName());


        // add to tray HashMap
        subjectsFolderStack.addToTrayHashMap(scienceFile1.getFileNumber(), scienceFile1.getFileName());
        subjectsFolderStack.addToTrayHashMap(scienceFile2.getFileNumber(), scienceFile2.getFileName());
        subjectsFolderStack.addToTrayHashMap(mathsFile1.getFileNumber(), mathsFile1.getFileName());
        subjectsFolderStack.addToTrayHashMap(mathsFile2.getFileNumber(), mathsFile2.getFileName());
        subjectsFolderStack.addToTrayHashMap(statisticsFile1.getFileNumber(), statisticsFile1.getFileName());
        subjectsFolderStack.addToTrayHashMap(statisticsFile2.getFileNumber(), statisticsFile2.getFileName());
        subjectsFolderStack.addToTrayHashMap(computerScienceFile1.getFileNumber(), computerScienceFile1.getFileName());
        subjectsFolderStack.addToTrayHashMap(computerScienceFile2.getFileNumber(), computerScienceFile2.getFileName());
        subjectsFolderStack.addToTrayHashMap(englishFile1.getFileNumber(), englishFile1.getFileName());
        subjectsFolderStack.addToTrayHashMap(englishFile2.getFileNumber(), englishFile2.getFileName());


        // Add created folder into tray
        subjectsFolderStack.insertFolder(science);
        subjectsFolderStack.insertFolder(maths);
        subjectsFolderStack.insertFolder(statistics);
        subjectsFolderStack.insertFolder(computerScience);
        subjectsFolderStack.insertFolder(english);

        return subjectsFolderStack;
    }

}
