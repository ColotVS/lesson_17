import java.util.Calendar;
import java.util.GregorianCalendar;

public class lesson_17_29 {
    //Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
    //Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
    //Помни, что в григорианском календаре неделя начинается с воскресенья.
    static Calendar birthDate = new GregorianCalendar(1998,Calendar.MAY,23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return switch (dayOfWeek) {
            case 1 -> "Воскресенье";
            case 2 -> "Понедельник";
            case 3 -> "Вторник";
            case 4 -> "Среда";
            case 5 -> "Четверг";
            case 6 -> "Пятница";
            case 7 -> "Суббота";
            default -> null;
        };
    }

}
