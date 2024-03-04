import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class lesson_17_55 {
    //Реализуй два метода:

    //в методе getSortedZones верни множество TreeSet всех временных зон;
    //в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zone);
    }
}
