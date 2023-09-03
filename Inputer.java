import java.util.Scanner;

public class Inputer {
    public static String inputData() {
        System.out.println("Введите данные в следующем формате: Фамилия Имя Отчество Дата_рождения(dd.mm.yyyy) номер_телефона пол(f или m): ");
        Scanner scanner = new Scanner(System.in); // хотел сделать с ресурсами, но, при повторном вызове ловил NoSuchElementException: No line found
        String inputedString = scanner.nextLine(); // как можно его закрыть в таком случае?
        return inputedString;
    }
}

