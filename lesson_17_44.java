import java.time.LocalTime;

public class lesson_17_44 {
    //Изменение времени в объекте класса LocalTime

    //Класс LocalTime также содержит методы, которые позволяют работать со временем.
    //Эти методы реализованы по аналогии с методами класса LocalDate: каждый из них не меняет существующий объект LocalTime,
    //а возвращает новый с нужными данными.

    //Вот какие методы есть у класса LocalTime:
    //Метод	                    Описание
    //plusHours(int hours)      Добавляет часы
    //plusMinutes(int minutes)  Добавляет минуты
    //plusSeconds(int seconds)  Добавляет секунды
    //plusNanos(int nanos)      Добавляет наносекунды
    //minusHours(int hours)     Вычитает часы
    //minusMinutes(int minutes) Вычитает минуты
    //minusSeconds(int seconds) Вычитает секунды
    //minusNanos(int nanos)     Вычитает наносекунды

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = time.plusHours(2);
        LocalTime time3 = time.minusMinutes(40);
        LocalTime time4 = time.plusSeconds(3601);

        System.out.println(time);       //11:27:41.891793200
        System.out.println(time2);      //13:27:41.891793200
        System.out.println(time3);      //10:47:41.891793200
        System.out.println(time4);      //12:27:42.891793200
    }
}
