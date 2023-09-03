
public class Main {
    public static void main(String[] args) {

        boolean verifier = false; // тут всякие нужные переменные
        String[] inputStringSplit = null;
        int phonePosititon = -1; //
        int genderPosition = -1;
        int birthDayPosition = -1;

        while(!verifier) {
            String inputString = Inputer.inputData(); // получаем строку с информацией
            inputStringSplit = DataSplitter.split(inputString); // распиливаем строку на массив
            int fieldNumberVerify = FieldNumberVerifier.statusCode(inputStringSplit); // проверяем массив на заполнение полей
            StatusCodeTranslator.translate(fieldNumberVerify); // расшифровываем ошибку, если нужно

            phonePosititon = PhoneNumberFinder.findNumber(inputStringSplit); // пишем позицию номера телефона

            genderPosition = GenderFinder.findGender(inputStringSplit); // пишем позицию гендера

            birthDayPosition = DateFinder.dateFind(inputStringSplit); // пишем позицию даты

            if(fieldNumberVerify == 1 && phonePosititon != -1 && genderPosition != -1 && birthDayPosition != -1) {
                verifier = true;
            }
        }
        String[] resultArr = DataBuilder.build(inputStringSplit, birthDayPosition, phonePosititon, genderPosition);
        MyFileWriter.write(resultArr);

    }
}
