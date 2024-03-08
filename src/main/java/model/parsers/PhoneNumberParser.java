package model.parsers;

import java.text.ParseException;

public class PhoneNumberParser extends Parser{

    private long phoneNumber;
    public PhoneNumberParser(String line) {
        super(line);
        parse();
    }

    @Override
    public void parse() {
        try {
            phoneNumber = Long.parseLong(strings[4]);
            valid = true;
        } catch (NumberFormatException e) {
            valid = false;
            while (!valid) {
                messages.invalidPhone();
                strings[4] = dataCollector.getData();
                parse();
            }
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
