package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String folderName;
    private String createdDate;
    private String folderOwner;
    private FileType fileType;

    private List<File> files = new ArrayList<>();

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
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

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Folder(String folderName, String createdDate, String folderOwner, FileType fileType) {
        this.folderName = folderName;
        this.createdDate = createdDate;
        this.folderOwner = folderOwner;
        this.fileType = fileType;
    }

    public void addFileToFolder(File file) {
        if (file.getFileName() != null && !file.getFileName().equals("") && file.getFileNumber() > 0) {
            getFiles().add(file);
            file.getFileHashMap().put(file.getFileNumber(), file.getFileName());
        } else {
            System.out.println("File can't be identified");
        }
    }

}