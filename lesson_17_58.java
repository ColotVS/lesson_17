import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class lesson_17_58 {
    //В методе main присвой значение переменной globalTime, используя переменные localDateTime и zoneId.
    static LocalDateTime localDateTime = LocalDateTime.of(2024, 3, 4, 12, 55);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        globalTime = localDateTime.atZone(zoneId);

        System.out.println(globalTime);
    }
}
