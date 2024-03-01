import java.util.Calendar;
import java.util.GregorianCalendar;

public class lesson_17_28 {
    //Прокручивание фрагментов даты

    //Но иногда бывают ситуации, когда такое умное поведение излишне: хочется что-то сделать с одной частью даты, не меняя все остальное.
    //Для этого у класса Calendar есть специальный метод — roll(). По своей сигнатуре он полностью аналогичен методу add(),
    //но любые изменения с его помощью затрагивают один параметр, остальные остаются неизменными.

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2019, Calendar.FEBRUARY, 27);
        calendar.roll(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());         //Fri Dec 27 00:00:00 EET 2019
        //Месяц мы поменяли, а год и число остались неизменными.
    }
}
