import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class lesson_17_65 {
    //Парсинг времени
    //Класс DateTimeFormatter интересен еще и тем, что может не только преобразовывать дату и время в строку по заданному шаблону,
    //но и выполнять обратную операцию!
    //Анализ и разбор строки называют парсингом от слова parse.
    //Вот как выглядит такой процесс:

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("March-05-2024", dtf);
        System.out.println(date);               //2024-03-05

        //Сначала мы создаем объект DateTimeFormatter и задаем в нем шаблон парсинга.
        //Затем вызываем метод LocalDate.parse() или LocalTime.parse() или LocalDateTime.parse() и передаем в этот метод строку,
        //которую нужно распарсить и объект DateTimeFormatter, который понимает,
        //как и по какому шаблону нужно распарсивать переданный текст.
        //Еще один пример: на этот раз с парсингом времени.

        DateTimeFormatter dtft = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("23:59:59", dtft);
        System.out.println(time);               //23:59:59
    }
}
