public class GenderFinder {
    public static int findGender(String[] enteredArr) {
        int status = 0;
        int position = -1;
        for (int i = 0; i < enteredArr.length; i++) {
            if(enteredArr[i].equals("f") || enteredArr[i].equals("m")) {
                status = 1; // если нашли - статус в единицу
                position = i;
            }
        }
        try {
            if(status == 0) {
                throw new IllegalArgumentException("Не введён пол");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }

        return position; // вернули позицию гендера
    }
}
