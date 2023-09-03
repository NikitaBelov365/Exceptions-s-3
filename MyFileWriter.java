import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyFileWriter {
    public static void write(String[] inputArr) {
        String fileName = inputArr[0]+".txt";
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < inputArr.length; i++) {
            resultString.append("<").append(inputArr[i]).append(">");
        }

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(resultString + "\n");
            System.out.println("Добавлено.");
            System.out.println(resultString);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при добавлении строк в файл: " + Arrays.toString(e.getStackTrace()));
        }
    }
}
