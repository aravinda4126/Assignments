package Assignment4;

import java.util.HashMap;
import java.util.Stack;

public class Tray {

    private String trayName;

    private Stack<Folder> folderStack = new Stack<>();

    private Stack<Folder> stack2 = new Stack<>();

    private HashMap<Integer, String> trayHashMap = new HashMap<>();

    public String getTrayName() {
        return trayName;
    }

    public void setTrayName(String trayName) {
        this.trayName = trayName;
    }

    public Stack<Folder> getFolderStack() {
        return folderStack;
    }

    public void setFolderStack(Stack<Folder> folderStack) {
        this.folderStack = folderStack;
    }

    public Stack<Folder> getStack2() {
        return stack2;
    }

    public void setStack2(Stack<Folder> stack2) {
        this.stack2 = stack2;
    }

    public HashMap<Integer, String> getTrayHashMap() {
        return trayHashMap;
    }

    public void setTrayHashMap(HashMap<Integer, String> trayHashMap) {
        this.trayHashMap = trayHashMap;
    }

    public Tray(String trayName) {
        this.trayName = trayName;
    }


    // insert a folder to tray
    public void insertFolder (Folder newFolder) {
        if ((newFolder.getFolderName() != null) && (!newFolder.getFolderName().equals(""))){
            boolean isFound = false;
            for (Folder folder : getFolderStack()){
                if (newFolder.getFolderName().equals(folder.getFolderName())) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                getFolderStack().push(newFolder);
            }
            else {
                System.out.println(newFolder.getFolderName() + " is an already exist folder");
            }
        }
        else {
            System.out.println("Folder can't be inserted");
        }
    }

    public void addToTrayHashMap(int fileNumber, String fileName){
        if (fileNumber!=0 && fileName != null && !fileName.equals(""))
            getTrayHashMap().put(fileNumber, fileName);
        else
            System.out.println("Can't insert file");
    }


    public void resetFolderStack() {
        while (!getStack2().isEmpty()){
            getFolderStack().push(getStack2().pop());
        }
    }


    // check weather a folder exist or mot. return true if found
    public boolean validFolderName (String targetFolderName) {
        boolean isFound = false;
        Folder poppedFolder;
        while (!getFolderStack().isEmpty()) {
            poppedFolder = getFolderStack().pop();
            getStack2().push(poppedFolder);
            if (poppedFolder.getFolderName().equals(targetFolderName)) {
                isFound = true;
                break;
            }
        }
        resetFolderStack();
        return isFound;
    }

    public void searchFolderByName(String targetFolderName) {
        boolean isFoundFolder = validFolderName(targetFolderName);
        if (isFoundFolder) {
            System.out.println("Folder Exists");
        } else {
            System.out.println("Folder doesn't exist");
        }
    }

    public void folderDetails(Folder poppedFolder){
        System.out.println("Folder Name : " + poppedFolder.getFolderName());
        System.out.println("Created date : " + poppedFolder.getCreatedDate());
        System.out.println("Owner of the folder : " + poppedFolder.getFolderOwner());
        System.out.println("Type of the files : " + poppedFolder.getFileType());
        System.out.println("----------------------------");
        System.out.println();
    }

    // print details if a certain folder
    public void printFolder (String targetFolderName) {
        Folder poppedFolder;
        while (!getFolderStack().isEmpty()) {
            poppedFolder = getFolderStack().pop();
            getStack2().push(poppedFolder);
            if (poppedFolder.getFolderName().equals(targetFolderName)) {
                folderDetails(poppedFolder);
                break;
            }
        }
        resetFolderStack();
    }

    // print details of each folder
    public void printFolders () {
        Folder poppedFolder;
        while (!getFolderStack().isEmpty()) {
            poppedFolder = getFolderStack().pop();
            folderDetails(poppedFolder);
        }
        resetFolderStack();
    }

    public void removeFolder(){
        Folder folder = popFolder();
        System.out.println("Folder removed with its files and No longer exist in the tray");
        System.out.println("Name of the removed folder : " + folder.getFolderName());
        System.out.println("------------------------");
    }

    // remove a folder from tray
    public Folder popFolder() {
        Folder poppedFolder = null;
        if(!getFolderStack().isEmpty()){
            poppedFolder = getFolderStack().pop();
        }
        return poppedFolder;
    }

    // print details of top most folder of tray. peek()
    public void printTopFolder () {
        Folder folder = popFolder();
        getStack2().push(folder);
        folderDetails(folder);
        resetFolderStack();
    }

    // print folder names
    public void printFolderNames() {
        System.out.println("Folder Names : ");
        Folder poppedFolder;
        int num = 0;
        while (!getFolderStack().isEmpty()) {
            poppedFolder = getFolderStack().pop();
            getStack2().push(poppedFolder);
            System.out.println(++num + ". " + poppedFolder.getFolderName());
        }
        System.out.println("-------------------");
        resetFolderStack();
    }


    // Check existence of a file from hash map in the tray, using file number. return true if found.
    public boolean validFileByNumber (int targetFileNumber) {
        return  (trayHashMap.containsKey(targetFileNumber));
    }

    // Check existence of a file from hash map, using file name. return true if found.
    public boolean validFileByName (String targetFileName) {
        return  (trayHashMap.containsValue(targetFileName));
    }

    // search a file by number
    public void searchFileByNumber (int targetFileNumber) {
        if(validFileByNumber(targetFileNumber))
            System.out.println("File Exists");
        else
            System.out.println("File Doesn't Exist");
    }

    // search file by name
    public void searchFileByName (String targetFileName) {
        if(validFileByName(targetFileName))
            System.out.println("File Exists");
        else
            System.out.println("File Doesn't Exist");
    }

    // print file hash map
    public void printFileHashMap() {
        System.out.println(trayHashMap);
    }

    // file details menu
    public void fileDetails(File file) {
        System.out.println();
        System.out.println("File name : " + file.getFileName());
        System.out.println("File number : " + file.getFileNumber());
        System.out.println("Created date : " + file.getCreatedDate());
        System.out.println("Content : " + file.getContent());
        System.out.println("--------------------");
    }

    // print details of a certain file. searching file by number.
    public void printFileByNumber (int targetFileNumber) {
        if (validFileByNumber(targetFileNumber)) {
            Folder poppedFolder;
            boolean isFileFound = false;
            while(!getFolderStack().isEmpty()) {
                poppedFolder = getFolderStack().pop();
                getStack2().push(poppedFolder);
                for (File file : poppedFolder.getFiles()) {
                    if (file.getFileNumber() == targetFileNumber){
                        fileDetails(file);
                        isFileFound = true;
                        break;
                    }
                }
                if (isFileFound) {
                    break;
                }
            }
            resetFolderStack();
        }
        else {
            System.out.println("File Doesn't Exist");
        }
    }

    // print details of a certain file. searching file by name.
    public void printFileByName (String targetFileName) {
        if (validFileByName(targetFileName)) {
            Folder poppedFolder;
            boolean isFileFound = false;
            while(!getFolderStack().isEmpty()) {
                poppedFolder = getFolderStack().pop();
                getStack2().push(poppedFolder);
                for (File file : poppedFolder.getFiles()) {
                    if (file.getFileName().equals(targetFileName)){
                        fileDetails(file);
                        isFileFound = true;
                        break;
                    }
                }
                if (isFileFound) {
                    break;
                }
            }
            resetFolderStack();
        }
        else {
            System.out.println("File Doesn't Exist");
        }
    }

    // print details of each file.
    public void printFiles () {
        Folder poppedFolder;
        while(!getFolderStack().isEmpty()) {
            poppedFolder = getFolderStack().pop();
            getStack2().push(poppedFolder);
            for (File file : poppedFolder.getFiles()) {
                fileDetails(file);
            }
        }
        resetFolderStack();
   }

}
