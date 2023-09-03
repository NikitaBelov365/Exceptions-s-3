public class PhoneNumberFinder {
    public static int findNumber(String[] enteredArr) {
        int status = 0; // статус нахождения номера
        long phoneNumber = 0; // сделал переменную для номера
        int position = -1;
        for (int i = 0; i < enteredArr.length; i++) {
            try {
                phoneNumber = Long.parseLong(enteredArr[i]); // пытаемся пропарсить
                status = 1; // если успешно - статус найден
                position = i;
            } catch (NumberFormatException e) {
                e.getMessage(); // тут пропускаем не лонговые типы данных
            }
        }
        try {
            if(status == 0) {
                throw new NumberFormatException("Номер телефона не найден");
            }
        } catch (NumberFormatException e) { // если не нашли телефон - намбер формат
            System.out.println("Ошибка: " + e);
        }

        return position;
    }
}
