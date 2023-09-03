import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFinder {
    public static int dateFind(String[] enteredArr) {
        String status = "0"; // статус операции пока 0
        int position = -1; // тут для записи i нужна интовая переменная, потом в стрингу засуну
        String dateFormatPattern = "dd.MM.yyyy"; // задал паттерн даты
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern); // создал экземпляр
        dateFormat.setLenient(false); // тут написали что это жёсткая привязка к формату даты

        for (int i = 0; i < enteredArr.length; i++) {
            if(enteredArr[i].contains(".")) { // если в строке есть точка, то проверяем дальше
                try {
                    dateFormat.parse(enteredArr[i]); // пытаемся пропарсить дату
                    status = "1"; // если получилось записываем статус
                    position = i; // записываем позицию
                } catch (ParseException e) {
                    System.out.println("Строка не содержит дату" + e);
                }
            }
        }
        try {
            if(status.equals("0")) {
                throw new IllegalArgumentException("Дата отсутствует или введена не в формате dd.mm.yyyy");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }
        return position; // возвращаем позицию даты
    }
}
