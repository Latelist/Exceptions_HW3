package model.packer;

import model.contacts.Contact;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Packer {
    private Contact contact;
    private String path;

    private File file;
    private FileWriter fileWriter;

    public Packer(Contact contact) throws IOException {
        this.contact = contact;
        path = contact.getSurname() + ".txt";
        file = new File(path);
    }

    public void writeContact() throws IOException {
        fileWriter = new FileWriter(file, true);
        fileWriter.write(contact.toString() + "\n");
        fileWriter.flush();
        fileWriter.close();
    }


}
