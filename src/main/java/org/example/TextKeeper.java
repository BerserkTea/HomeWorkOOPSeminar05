package org.example;

public interface TextKeeper {
    String menu = "Главное меню\n" +
            "2. Удалить контакт\n"+
            "3. Сохранить файл\n" +
            "4. Показать все контакты\n" +
            "5. Добавить контакт\n" +
            "6. Найти контакт\n" +
            "7. Изменить контакт\n" +
            "8. Перезапуск программы\n" +
            "9. Выход";
    String firstTimeStart = "Добро пожаловать!\nДля работы с телефонной книгой сначала загрузите её из файла." +
                            "\n по умолчанию введите \"phone\"";

    String inputMenu = "Выберите пункт меню";

    String loadMenuError = "Ошибка ввода";

    String loadSuccesful = "Загружено успешно";

    String saveSuccesful = "Сохранено успешно";

    String emptyBookError = "Телефонная книга пуста или не открыта";

    String inputNewContact = "Введите имя нового контакта\n" +
            "Введите номер телефона\n" +
            "Введите комментарий";

    String inputEditName = "Введите имя нового контакта или Enter что бы оставить без изменений: ";
    String inputEditPhone = "Введите номер телефона или Enter что бы оставить без изменений: ";
    String inputEditComment = "Введите комментарий или Enter что бы оставить без изменений: ";
    String inputSearchWord = "Введите ключевое слово для поиска: ";

    String inputEditContactID = "Введите ID контакта для изменения";
    String inputEDelContactID = "Введите ID контакта для удаления";

    String operation = "создан, изменен, удален";
    String confirmChanges = "У вас есть несохраненные изменения,\n Сохранить? (y/n)";

    String exitProgramm = "Всего хорошего, до новых встрять!";

    String simpleError = "Произошла ошибка";

    String succesfulAdded ="Контакт успешно добавлен в книгу";
    String succesfulDeleted ="Контакт успешно удален из книги";

    String enterFileName = "Введите имя файла";

}
