import java.time.ZoneId;
import java.time.ZonedDateTime;

public class lesson_17_56 {
    //Создание объекта ZonedDateTime

    //При создании объекта ZonedDateTime нужно вызвать у него статический метод now() и передать в него объект ZoneId.

    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(time);                           //2024-03-04T07:48:02.614992900+02:00[Africa/Cairo]
        //Если в метод now() не передать объект ZoneId, а так можно,
        //временная зона будет определена автоматически: на основе настроек компьютера, на котором выполняется программа.
        ZonedDateTime timeBarnaul = ZonedDateTime.now();
        System.out.println(timeBarnaul);                    //2024-03-04T12:49:12.312922800+07:00[Asia/Barnaul]
    }
    //Преобразование глобальной даты в локальную
    //Одной из интересных особенностей ZonedDateTime является возможность его преобразования в локальную дату и время.

    //ZoneId zone = ZoneId.of("Africa/Cairo");
    //ZonedDateTime cairoTime = ZonedDateTime.now(zone);
    //LocalDate localDate = cairoTime.toLocalDate();
    //LocalTime localTime = cairoTime.toLocalTime();
    //LocalDateTime localDateTime = cairoTime.toLocalDateTime();
}
