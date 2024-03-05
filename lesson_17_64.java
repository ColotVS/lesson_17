import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class lesson_17_64 {
    //В методе main выведи на экран переменную zonedDateTime в таком виде:
    //2 5.3.24 11:53:18.643990800 Asia/Barnaul

    //Где:
    //2 — номер дня недели, т.е. четверг;
    //5 — день месяца;
    //3 — месяц;
    //24 — год;
    //11 — часы;
    //53 — минуты;
    //18 — секунды;
    //643990800 — наносекунды;
    //Asia/Barnaul — временная зона.

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String str = dtf.format(zonedDateTime);
        System.out.println(str);
    }
}
