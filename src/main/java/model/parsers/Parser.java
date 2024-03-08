package model.parsers;

import model.collector.DataCollector;
import view.Messages;

public abstract class Parser implements ParserService {
    protected String line;
    protected String[] strings;
    protected boolean valid;

    protected DataCollector dataCollector;
    protected Messages messages;

    public Parser(String line) {
        this.line = line;
        dataCollector = new DataCollector();
        messages = new Messages();
        strings = this.line.split("\\s+");
        if (strings.length != 6) {
            valid = false;
        } else {
            valid = true;
        }
        while (!valid) {
            if (strings.length <6) {
                messages.invalidLengthLess();
                this.line = dataCollector.getData();
                strings = this.line.split("\\s+");
                if (strings.length == 6) {
                    valid = true;
                }
            } else {
                messages.invalidLengthMore();
                this.line = dataCollector.getData();
                strings = this.line.split("\\s+");
                if (strings.length == 6) {
                    valid = true;
                }
            }
        }
    }

    public void setLine(String line) {
        this.line = line;
    }

    public boolean isValid() {
        return valid;
    }

    public String getLine() {
        return line;
    }
}
