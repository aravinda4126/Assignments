package Assignment4;

import java.util.Stack;

public class Tray {

    private String trayName;

    private Stack<Folder> folderStack = new Stack<>();

    public Tray(String trayName) {
        this.trayName = trayName;
    }

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

    // insert a folder to tray
    public void insertFolder (Folder newFolder) {
        if ((newFolder.getFolderName() != null) && (!newFolder.getFolderName().equals(""))){
            boolean isFound = false;
            for (Folder folder : folderStack){
                if (newFolder.getFolderName().equals(folder.getFolderName())) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                folderStack.push(newFolder);
            }
            else {
                System.out.println(newFolder.getFolderName() + " is an already exist folder");
            }
        }
        else {
            System.out.println("Folder can't be inserted");
        }
    }

    // print details of each folder
    public void printFolders () {
        Folder poppedFolder;
        while (!folderStack.isEmpty()) {
            poppedFolder = folderStack.pop();
            System.out.println(poppedFolder.toString());
        }
    }

    // search a folder by name and print details
    public void searchFolderByName (String targetFolderName) {
        boolean isFound = false;
        Folder poppedFolder = null;
        while (!folderStack.isEmpty()) {
            poppedFolder = folderStack.pop();
            if (poppedFolder.getFolderName().equals(targetFolderName)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Folder Found");
            System.out.println(poppedFolder.toString());
        } else {
            System.out.println("Folder Not Found");
        }
    }

}
