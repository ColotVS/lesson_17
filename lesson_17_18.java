import java.text.SimpleDateFormat;
import java.util.Date;

public class lesson_17_18 {
    //Класс SimpleDateFormat

    //Помните, когда мы выводили дату на экран, отображалось что-то типа Thu Feb 21 14:01:34 EET 2019.
    //Вроде бы все правильно, но это скорее отображение даты для программиста.
    //А для пользователя хотелось бы отображать дату попонятнее. Что-нибудь типа Вторник, 21 Февраля.
    //И без года. Ну или с годом, если надо. В общем, хотелось бы отображать дату разными способами.
    //Для этого есть специальный класс — SimpleDateFormat.

    public static void main(String[] args) {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String message = formatter.format(current);
        System.out.println(message);                    //Вывод: 03-01-2024
    }
    //А все дело в том, что мы отображали не сам объект Date, а специальную строку,
    //полученную вызовом метода format() у объекта типа SimpleDateFormat. Но ключевое здесь даже не это.

    //Когда объект SimpleDateFormat создается, в него в виде параметров мы передаем строку "MM-dd-yyyy".
    //Вот в этой строке и зашифрован формат даты, который вы увидели в итоге на экране.
    //MM вывести месяц в виде 2 цифр
    //dd — вывести день месяца
    //yyyy — вывести год, состоящий из четырех цифр
}
