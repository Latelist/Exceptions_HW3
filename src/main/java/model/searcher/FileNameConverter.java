package model.searcher;

public class FileNameConverter {
    private String surname;
    private String fileName;

    public FileNameConverter(String surname) {
        this.surname = surname;
        fileName = surname + ".txt";
    }

    public String getFileName() {
        return fileName;
    }
}
