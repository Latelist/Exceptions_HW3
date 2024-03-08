package model.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactReader {
    private BufferedReader bufferedReader;
    private String line;
    public ContactReader(String filePath) throws IOException {
        bufferedReader = new BufferedReader(new FileReader(filePath));
        line = bufferedReader.readLine();
    }

    public String getLine() {
        return line;
    }
}
