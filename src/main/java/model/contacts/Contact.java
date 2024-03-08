package model.contacts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {
    private String surname;
    private String name;
    private String fathername;
    private Date birthday;
    private long phoneNumber;
    private char sex;

    public Contact(String surname, String name, String fathername, Date birthday, long phoneNumber, char sex) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String formattedDate = formatter.format(birthday);
        return sex + " " + surname + " " + name + " " + fathername + ", " + formattedDate + ", " + phoneNumber;
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

    public Date getBirthday() {
        return birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
