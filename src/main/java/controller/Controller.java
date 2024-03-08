package controller;

import model.collector.DataCollector;
import model.contacts.Contact;
import model.packer.Packer;
import model.parsers.BirthdayParser;
import model.parsers.NameParser;
import model.parsers.PhoneNumberParser;
import model.parsers.SexParser;
import model.reader.ContactReader;
import model.searcher.FileNameConverter;
import model.searcher.Searcher;
import states.States;
import view.Messages;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Controller {
    private States state;
    private String string;
    private BirthdayParser birthdayParser;
    private NameParser nameParser;
    private PhoneNumberParser phoneNumberParser;
    private SexParser sexParser;
    private DataCollector dataCollector;
    private Contact contact;
    private Packer packer;
    private Messages messages;
    private String mode;
    private FileNameConverter fileNameConverter;
    private Searcher searcher;
    private String surname;

    private final String currentDir;
    private Path basePath;

    public Controller() {
        currentDir = System.getProperty("user.dir");
        basePath = Paths.get(currentDir);
        state = States.ON;
        messages = new Messages();
        dataCollector = new DataCollector();
        string = " ";
    }



    public void workCycle() throws IOException, URISyntaxException {

        messages.startMessage();
        while (state.equals(States.ON)) {
            messages.continueMessage();
            mode = dataCollector.getData();
            switch (mode) {
                case "1":
                {
                    messages.inputContactMessage();
                    string = dataCollector.getData();
                    nameParser = new NameParser(string);
                    string = nameParser.getLine();
                    birthdayParser = new BirthdayParser(string);
                    phoneNumberParser = new PhoneNumberParser(string);
                    sexParser = new SexParser(string);
                    contact = new Contact(nameParser.getSurname(), nameParser.getName(),
                            nameParser.getFathername(), birthdayParser.getDate(),
                            phoneNumberParser.getPhoneNumber(), sexParser.getSex());
                    packer = new Packer(contact);
                    packer.writeContact();
                    messages.contactInputSuccessful();
                    break;
                } case "2":
                    messages.fileNameInputMessage();
                    String line = dataCollector.getData();
                    fileNameConverter = new FileNameConverter(line);
                    searcher = new Searcher(new File(String.valueOf(basePath)), fileNameConverter.getFileName());
                    ContactReader contactReader = new ContactReader(searcher.getResult().getPath());
                    System.out.println(contactReader.getLine());
                    break;
                default:
                    messages.invalidMode();
                    break;
            }
            messages.willContinue();
            mode = dataCollector.getData();
            switch (mode) {
                case "N":
                    messages.goodByeMessage();
                    state = States.OFF;
                default:
                    break;
            }
        }
    }
}
