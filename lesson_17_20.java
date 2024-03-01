import java.util.Calendar;
import java.util.Date;

public class lesson_17_20 {
    //Проинициализируй переменную birthDate объектом Date с датой своего рождения.
    //Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.
    static Date birthDate = new Date(98, Calendar.MAY, 23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        return switch (day) {
            case 0 -> "воскресенье";
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            default -> result;
        };
    }
}
