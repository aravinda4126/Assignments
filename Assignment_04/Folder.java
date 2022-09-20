package Assignment4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Folder {

    private String folderName;
    private LocalDate createdDate;
    private String folderOwner;
    private FileType fileType;

    private List<File> fileList = new ArrayList<>();
    private HashMap<Integer, String> fileHashMap = new HashMap<>();

    public Folder(String folderName, LocalDate createdDate, String folderOwner, FileType fileType) {
        this.folderName = folderName;
        this.createdDate = createdDate;
        this.folderOwner = folderOwner;
        this.fileType = fileType;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getFolderOwner() {
        return folderOwner;
    }

    public void setFolderOwner(String folderOwner) {
        this.folderOwner = folderOwner;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public HashMap<Integer, String> getFileHashMap() {
        return fileHashMap;
    }

    public void setFileHashMap(HashMap<Integer, String> fileHashMap) {
        this.fileHashMap = fileHashMap;
    }

    @Override
    public String toString() {
        return "Folder {" +
                "FolderName = '" + folderName + '\'' +
                ", CreatedDate = '" + createdDate + '\'' +
                ", FolderOwner = '" + folderOwner + '\'' +
                ", FileType = " + fileType +
                '}';
    }

    public void addFileAndHashMap(File file) {
        if (file.getFileName() != null && !file.getFileName().equals("") && file.getFileNumber() > 0) {
            fileList.add(file);
            fileHashMap.put(file.getFileNumber(), file.getFileName());
        } else {
            System.out.println("File can't be identified");
        }
    }

    public void printFileHashMap() {
        System.out.println(fileHashMap);
    }

    public boolean searchFileByNumber (int targetFileNumber){
        boolean isFound = false;
        for(File file : fileList){
            if(file.getFileNumber() == targetFileNumber){
                isFound = true;
                System.out.println("File Found");
                System.out.println(file.toString());
                break;
            }
        }
        return isFound;
    }

    public boolean searchFileByName (String targetFileName){
        boolean isFound = false;
        for(File file : fileList){
            if(file.getFileName().equals(targetFileName)){
                isFound = true;
                System.out.println("File Found");
                System.out.println(file.toString());
                break;
            }
        }
        return isFound;
    }

}