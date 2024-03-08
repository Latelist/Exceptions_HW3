package view;

public class Messages {
    public void startMessage() {
        System.out.println("Здравствуйте. Это приложение для работы с контактами.");
    }

    public void inputContactMessage() {
        System.out.println("Введите контакт в формате: \n" +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол\n\n" +
                "Дата рождения вводится в формате: dd.MM.yyyy. Пример: 18.09.2013\n" +
                "Номер телефона вводится как число. Пример: 89164493581 \n" +
                "Пол вводится одной латинской буквой: f — женский, m — мужской.\n");
    }

    public void invalidLengthLess() {
        System.out.println("Вы что-то пропустили. Пожалуйста, введите данные в формате: \n" +
                "Фамилия Имя Отчество дата_рождения(dd.MM.yyyy) номер_телефона пол(f/m)");
    }

    public void invalidLengthMore() {
        System.out.println("Вы ввели слишком много данных. Пожалуйста, введите только данные в формате " +
                        "ниже:\n" + "Фамилия Имя Отчество дата_рождения(dd.MM.yyyy) номер_телефона пол(f/m)");
    }

    public void invalidBirthday() {
        System.out.println("Вы ввели дату в формате, который я не умею читать. Пожалуйста, введите дату" +
                " в формате:\n" + "dd.MM.yyyy. Пример: 18.07.1999");
    }

    public void invalidPhone() {
        System.out.println("Вы ввели телефон в формате, который я не умею читать. " +
                "Пожалуйста, введите телефон в формате числа. Пример: 89123468593");
    }

    public void invalidSex() {
        System.out.println("Пол вводится в формате: 'f' — для женщин, " +
                "'m' — для мужчин.");
    }

    public void willContinue() {
        System.out.println("Продолжить работу? Y/N");
    }

    public void goodByeMessage() {
        System.out.println("Спасибо за работу. До свидания.");
    }

    public void fileNameInputMessage() {
        System.out.println("Введите фамилию контакта: ");
    }

    public void contactInputSuccessful() {
        System.out.println("Спасибо! Контакт записан.");
    }
    public void continueMessage() {
        System.out.println("Введите:\n" +
                "1 — чтобы добавить контакт; \n" +
                "2 — чтобы посмотреть контакты.");
    }

    public void invalidMode() {
        System.out.println("У меня нет такого мода.");
    }
}
