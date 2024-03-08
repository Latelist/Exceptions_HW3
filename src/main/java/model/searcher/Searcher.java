package model.searcher;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Searcher {


    private File result;
    private boolean valid;

    public Searcher(File directory, String fileName) {

        result = findFile(fileName, directory);
        if (result != null) {
            valid = true;
        } else {
            valid = false;
        }
    }

    public File findFile (String name, File directory) {
        File[] list = directory.listFiles(); //список файлов в директории
        if (list != null) {
            for (File file : list) {
                if (file.isDirectory()) {
                    File found = findFile(name, file);
                    if (found != null) {
                        return found;
                    }
                } else {
                    if (name.equalsIgnoreCase(file.getName())) {
                        return file;
                    }
                }
            }
        } return null;
    }

    public File getResult() {
        return result;
    }

    public boolean isValid() {
        return valid;
    }
}
