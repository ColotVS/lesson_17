import java.util.Calendar;

public class lesson_17_25 {
    //Работа с фрагментами даты

    //Чтобы получить фрагмент даты (год, месяц, ...), у класса Calendar есть специальный метод — get(). Метод один, зато с параметрами:
    //int month = calendar.get(Calendar.MONTH);
    //Где calendar — это переменная типа Calendar, а MONTH — это переменная-константа класса Calendar.
    //В метод get в качестве параметра вы передаете специальную константу класса Calendar, и в результате получаете нужное значение.

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.ERA));             //эра (до нашей эры или после)
        System.out.println(calendar.get(Calendar.YEAR));            //год
        System.out.println(calendar.get(Calendar.MONTH));           //месяц
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));    //день месяца

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));     //день недели
        System.out.println(calendar.get(Calendar.HOUR));            //часы
        System.out.println(calendar.get(Calendar.MINUTE));          //минуты
        System.out.println(calendar.get(Calendar.SECOND));          //секунды

    //Для изменения фрагмента даты используется метод set:
    //calendar.set(Calendar.MONTH, значение);
    //Где calendar — это переменная типа Calendar, а MONTH — это переменная-константа класса Calendar.
    //В метод set в качестве первого параметра вы передаете специальную константу класса Calendar,
    //а в качестве второго параметра — новое значение.

        calendar.set(Calendar.YEAR, 2019);                          //год = 2019
        calendar.set(Calendar.MONTH, 6);                            //месяц = Июль (нумерация с 0)
        calendar.set(Calendar.DAY_OF_MONTH, 4);                     //4 число
        calendar.set(Calendar.HOUR_OF_DAY, 12);                     //часы
        calendar.set(Calendar.MINUTE, 15);                          //минуты
        calendar.set(Calendar.SECOND, 0);                           //секунды

        System.out.println(calendar.getTime());                     //Thu Jul 04 12:15:00 GMT+07:00 2019
    }
}
