import java.util.Calendar;
import java.util.GregorianCalendar;

public class lesson_17_31 {
    //Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);
        int i = 1;
        System.out.print("Старт ");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.print(i + " ");
            i++;
        }
        System.out.print("Финиш");
    }
}
