package Assignment4;

import java.time.LocalDate;

public class File{

    private int fileNumber;
    private String fileName;
    private LocalDate createdDate;
    private String content;

    public File(int fileNumber, String fileName, LocalDate createdDate, String content) {
        this.fileNumber = fileNumber;
        this.fileName = fileName;
        this.createdDate = createdDate;
        this.content = content;
    }

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

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "File {" +
                "FileNumber = " + fileNumber +
                ", FileName = '" + fileName + '\'' +
                ", CreatedDate = '" + createdDate + '\'' +
                ", Content = '" + content + '\'' +
                '}';
    }

}