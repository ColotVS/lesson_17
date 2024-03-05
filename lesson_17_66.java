import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lesson_17_66 {
    //Инициализируй статическую переменную dateTimeFormatter.
    //Подумай, какой шаблон ей задать, чтобы можно было распарсить строку timeString.
    //В методе main создай объект LocalDateTime, используя строку timeString и твой шаблон dateTimeFormatter.
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");;
    static String timeString = "12:00:45 05/03/2024";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString,dateTimeFormatter);
        System.out.println(dateTime);
    }
}
