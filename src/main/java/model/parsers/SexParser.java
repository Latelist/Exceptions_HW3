package model.parsers;

import java.text.ParseException;

public class SexParser extends Parser{

    char sex;

    public SexParser(String line) {
        super(line);
        parse();
    }

    @Override
    public void parse() {
            sex = strings[5].charAt(0);
            valid = true;
            while (sex != 'f' && sex != 'm') {
                valid = false;
                messages.invalidSex();
                strings[5] = dataCollector.getData();
                parse();
            }
    }

    public char getSex() {
        return sex;
    }
}
