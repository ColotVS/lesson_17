public class lesson_17_57 {
    //Работа со временем

    //Как и у класса LocalDateTime, у класса ZonedDateTime есть много способов получить отдельные фрагменты даты и времени.
    //Вот список этих методов:
    //int getYear()             Возвращает год из конкретной даты
    //Month getMonth()          Возвращает месяц даты: одну из специальных констант JANUARY, FEBRUARY, ...;
    //int getMonthValue()       Возвращает номер месяца из даты. Январь == 1
    //int getDayOfMonth()       Возвращает номер дня в месяце
    //DayOfWeek getDayOfWeek()  Возвращает день недели: одну из специальных констант MONDAY, TUESDAY, ...;
    //int getDayOfYear()        Возвращает номер дня в году
    //int getHour()             Возвращает часы
    //int getMinute()           Возвращает минуты
    //int getSecond()           Возвращает секунды
    //int getNano()             Возвращает наносекунды

    //Все методы полностью аналогичны методам LocalDateTime.
    //И, конечно, у класса ZonedDateTime есть методы, которые позволяют работать с датой и временем.
    //При этом объект, у которого вызываются методы, не меняется: вместо этого методы возвращают новый объект ZonedDateTime:
    //plusYears(int)            Добавляет годы к дате
    //plusMonths(int)           Добавляет месяцы к дате
    //plusDays(int)             Добавляет дни к дате
    //plusHours(int)            Добавляет часы
    //plusMinutes(int)          Добавляет минуты
    //plusSeconds(int)          Добавляет секунды
    //plusNanos(int)            Добавляет наносекунды
    //minusYears(int)           Отнимает годы от даты
    //minusMonths(int)          Отнимает месяцы от даты
    //minusDays(int)            Отнимает дни от даты
    //minusHours(int)           Вычитает часы
    //minusMinutes(int)         Вычитает минуты
    //minusSeconds(int)         Вычитает секунды
    //minusNanos(int)           Вычитает наносекунды


}
