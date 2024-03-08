package model.parsers;

public class NameParser extends Parser{

    private String surname;
    private String name;
    private String fathername;
    public NameParser(String line) {
        super(line);
        parse();
    }

    @Override
    public void parse() {
            surname = strings[0];
            name = strings[1];
            fathername = strings[2];
            valid = true;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFathername() {
        return fathername;
    }
}
