package model.collector;

import java.util.Scanner;

public class DataCollector {
    private Scanner sc;

    public DataCollector() {
        this.sc = new Scanner(System.in);
    }

    public String getData() {
        return sc.nextLine();
    }
}
