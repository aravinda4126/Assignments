package Assignment4;

import java.time.LocalDate;

public class TrayCreator {

    /*
    1. create 5 folders
    2. create 2 files for each folders and insert them to folders
    3. insert folders to tray (stack)
    4. all the operations will be done using this tray
    */

    public Tray createFolders () {

        Tray subjectsFolderStack = new Tray("Subjects");

        // Science Subject
        Folder science = new Folder("Science", LocalDate.of(2022,3,10),"Science Teacher", FileType.PDF);
        File scienceFile1 = new File(101, "Heat", LocalDate.of(2022,3,11), "content1");
        File scienceFile2 = new File(102, "Power", LocalDate.of(2022,3,12), "content2");

        science.addFileAndHashMap(scienceFile1);
        science.addFileAndHashMap(scienceFile2);

        // Maths Subject
        Folder maths = new Folder("Maths", LocalDate.of(2022,4,12), "Maths Teacher", FileType.DOCX);
        File mathsFile1 = new File(103, "Integration", LocalDate.of(2022,4,13), "content3");
        File mathsFile2 = new File(104, "Matrices", LocalDate.of(2022,4,14), "content4");

        maths.addFileAndHashMap(mathsFile1);
        maths.addFileAndHashMap(mathsFile2);

        // Statistics Subject
        Folder statistics = new Folder("Statistics", LocalDate.of(2022, 1, 27), "Statistics Teacher", FileType.XLX);
        File statisticsFile1 = new File(105, "Probability", LocalDate.of(2022,1,28), "content5");
        File statisticsFile2 = new File(106, "Distributions", LocalDate.of(2022,1,29), "content6");

        statistics.addFileAndHashMap(statisticsFile1);
        statistics.addFileAndHashMap(statisticsFile2);

        // ComputerScience Subject
        Folder computerScience = new Folder("ComputerScience", LocalDate.of(2022,9,19), "ComputerScience Teacher", FileType.JPEG);
        File computerScienceFile1 = new File(107, "Java", LocalDate.of(2022,9,20), "content7");
        File computerScienceFile2 = new File(108, "Python", LocalDate.of(2022,9,21), "content8");

        computerScience.addFileAndHashMap(computerScienceFile1);
        computerScience.addFileAndHashMap(computerScienceFile2);

        // English Subject
        Folder english = new Folder("English", LocalDate.of(2022,6,23),"English Teacher", FileType.TXT);
        File englishFile1 = new File(109, "Essays", LocalDate.of(2022,6,24), "content9");
        File englishFile2 = new File(110, "Reading", LocalDate.of(2022,6,25), "content10");

        english.addFileAndHashMap(englishFile1);
        english.addFileAndHashMap(englishFile2);

        // Add created folder into tray
        subjectsFolderStack.insertFolder(science);
        subjectsFolderStack.insertFolder(maths);
        subjectsFolderStack.insertFolder(statistics);
        subjectsFolderStack.insertFolder(computerScience);
        subjectsFolderStack.insertFolder(english);

        return subjectsFolderStack;
    }

}
