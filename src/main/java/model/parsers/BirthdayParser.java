package model.parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayParser extends Parser{
    private SimpleDateFormat formatter;
    Date date;

    public BirthdayParser(String line) {
        super(line);
        formatter = new SimpleDateFormat("dd.MM.yyyy");
        parse();
    }

    @Override
    public void parse() {
        try {
            date = formatter.parse(strings[3]);
            valid = true;
        } catch (ParseException e) {
            valid = false;
            while (!valid) {
                messages.invalidBirthday();
                strings[3] = dataCollector.getData();
                parse();
            }
        }
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public Date getDate() {
        return date;
    }
}
