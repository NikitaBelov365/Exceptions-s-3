public class StatusCodeTranslator {
    public static void translate(int code) {
        switch (code) {
            case 2 -> System.out.println("Не достаточно введённых данных. Попробуйте снова.");
            case 3 -> System.out.println("Введён лишний пробел, либо лишние данные. Попробуйте снова.");
        }
    }
}
