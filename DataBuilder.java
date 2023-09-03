public class DataBuilder {
    public static String[] build(String[] inputedArr, int birthdayPosition, int phonePosition, int genderPosition){
        String[] resultArr = new String[inputedArr.length];
        int counter = 0;

        for (int i = 0; i < resultArr.length; i++) {
            if(i != birthdayPosition && i != phonePosition && i != genderPosition) { // пробегаем по массиву, кроме указанных значений
                resultArr[counter] = inputedArr[i]; // добавлем инфу
                counter++;
            }
        }
        resultArr[3] = inputedArr[birthdayPosition]; // добавляем инфу
        resultArr[4] = inputedArr[phonePosition]; // добавляем инфу
        resultArr[5] = inputedArr[genderPosition]; // добавляем инфу

        return resultArr; // возвращаем результат
    }
}
