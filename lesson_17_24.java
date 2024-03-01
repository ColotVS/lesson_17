import java.util.Calendar;
import java.util.GregorianCalendar;

public class lesson_17_24 {
    //Вывод объекта календарь на экран

    //Если просто вывести объект-календарь на экран, результат вас не сильно порадует.
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

    //Вывод: [time=1709296648261,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Barnaul",
    //offset=25200000,dstSavings=0,useDaylight=false,transitions=69,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,
    //ERA=1,YEAR=2024,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=61,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,
    //AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=37,SECOND=28,MILLISECOND=261,ZONE_OFFSET=25200000,DST_OFFSET=0]

    //Все дело в том, что календарь — это именно календарь, а не дата: у него много всяких настроек, и они все выводятся на экран.

    //Правильно будет отображать объект календарь с помощью класса SimpleDateFormat
    //Но есть ещё вариант, дело в том, что объект типа Calendar можно легко преобразовать к объекту типа Date,
    //а как выводить на экран объект типа Date, вы уже знаете.
    //Примерно так можно преобразовать объект Calendar в Date:
        Calendar calendar2 = new GregorianCalendar(2019, 03, 12);
        System.out.println(calendar2.getTime());    //Fri Apr 12 00:00:00 GMT+07:00 2019
    }

}
