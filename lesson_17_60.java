import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lesson_17_60 {
    //Класс DateTimeFormatter

    //В Date Time API был добавлен специальный класс DateTimeFormatter.
    //Его цель — по максимуму облегчить преобразование даты и времени именно в тот формат, который нужен программисту.
    //И можно сказать, что создателям Java это удалось.

    //Пользоваться им очень просто. Сначала нужно создать объект класса DateTimeFormatter и передать в него шаблон,
    //по которому будут отображаться дата и время:
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern(шаблон);
    //Где dtf — это переменная типа DateTimeFormatter. DateTimeFormatter.ofPattern() — это статический метод класса DateTimeFormatter.
    //А шаблон — это строка, которая задает шаблон, по которому будут отображаться дата и время.

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");
        String text = dtf.format( LocalDateTime.now() );
        System.out.println(text);                           //03-04-24
    }
    //В примере выше мы с помощью метода ofPattern() создаем объект DateTimeFormatter на основе строки-шаблона.
    //А в следующей строке с помощью метода format() преобразовываем объект типа LocalDateTime в строку.
    //В метод format() можно передать практически любой объект из Date Time API.

    //Статический метод ofPattern() тоже очень простой: принимает в качестве параметра строку-шаблон,
    //а возвращает объект типа DateTimeFormatter.
    //Самое интересное находится внутри шаблона.
}
