import java.time.LocalDateTime;

public class lesson_17_47 {
    //Класс LocalDateTime

    //Класс LocalDateTime объединяет в себе возможности классов LocalDate и LocalTime: он хранит и дату, и время.
    //Его объекты тоже неизменяемые, и его методы также аналогичны методам классов LocalDate и LocalTime.

    //Получение текущего момента: дата и время
    //Тут все в пределах ожиданий: тоже используется метод now(). Пример:
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Сейчас = " + time);         //Сейчас = 2024-03-03T15:57:31.822204800
    }
    //При выводе на экран дата и время разделяются буквой T.


    //Получение определенного момента: дата и время
    //Все ожидаемо аналогично классам LocalDate и LocalTime — используется метод of():
    //... = LocalDateTime.of(год, месяц, день, часы, минуты, секунды);
    //Сначала идут параметры, которые задают дату в тех же форматах, что и в классе LocalDate.
    //Затем идут параметры, задающие время в тех же форматах, что и в классе LocalTime.

    //Список всех вариаций метода of() приведен ниже:

    //Методы
    //of (int year, int month, int day, int hour, int minute)
    //of (int year, int month, int day, int hour, int minute, int second)
    //of (int year, int month, int day, int hour, int minute, int second, int nano)
    //of (int year, Month month, int day, int hour, int minute)
    //of (int year, Month month, int day, int hour, int minute, int second)
    //of (int year, Month month, int day, int hour, int minute, int second, int nano)
    //of (LocalDate date, LocalTime time)

    //Можно задать дату явно или через объекты LocalDate и LocalTime:
    //LocalDate date = LocalDate.now();
    //LocalTime time = LocalTime.now();
    //LocalDateTime current = LocalDateTime.of(date, time);
    //System.out.println("Сейчас = " + current);
    //LocalDateTime date = LocalDateTime.of(2019, Month.MAY, 15, 12, 15, 00);
    //System.out.println("Сейчас = " + date);

    //У класса LocalDateTime есть методы получения фрагмента даты и/или времени.
    //Они абсолютно аналогичны методам классов LocalDate и LocalTime.
}
