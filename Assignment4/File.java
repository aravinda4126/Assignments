package Assignment4;

import java.util.HashMap;

public class File{

    private int fileNumber;
    private String fileName;
    private String createdDate;
    private String content;

    private HashMap<Integer, String> fileHashMap = new HashMap<>();

    public int getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HashMap<Integer, String> getFileHashMap() {
        return fileHashMap;
    }

    public void setFileHashMap(HashMap<Integer, String> fileHashMap) {
        this.fileHashMap = fileHashMap;
    }

    public File(int fileNumber, String fileName, String createdDate, String content) {
        //super(folderName, createdDate, folderOwner, fileTypes);
        this.fileNumber = fileNumber;
        this.fileName = fileName;
        this.createdDate = createdDate;
        this.content = content;
    }

    public void addToFileHashMap(int fileNumber, String fileName){
        if (fileNumber!=0 && fileName != null && !fileName.equals(""))
            getFileHashMap().put(fileNumber, fileName);
        else
            System.out.println("Can't insert file");
    }

    public boolean isFoundSearchFileNumber (int targetFileNumber){
        return getFileHashMap().containsKey(targetFileNumber);
    }

    public boolean isFoundSearchFileByName (String targetFileName){
       return getFileHashMap().containsValue(targetFileName);
    }


}