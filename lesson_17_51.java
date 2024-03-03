import java.time.Instant;

public class lesson_17_51 {
    //Методы объектов Instant

    //У класса Instant есть два метода, которые возвращают его значения:
    //long getEpochSecond()     Количество секунд, прошедшее с 1 января 1970 года
    //int getNano()             Наносекунды.
    //long toEpochMilli()       Количество миллисекунд, прошедшее с 1 января 1970 года

    //Также есть методы, которые способны создавать новые объекты Instant на основе уже существующего:
    //Instant plusSeconds(long)     Добавляет секунды к текущему моменту времени
    //Instant plusMillis(long)      Добавляет миллисекунды
    //Instant plusNanos(long)       Добавляет наносекунды
    //Instant minusSeconds(long)    Вычитает секунды
    //Instant minusMillis(long)     Вычитает миллисекунды
    //Instant minusNanos(long)      Вычитает наносекунды

    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println(timestamp);          //2024-03-03T09:09:28.606542800Z

        long n = timestamp.toEpochMilli();
        Instant time = Instant.ofEpochMilli(n);
        System.out.println(time);               //2024-03-03T09:09:28.606Z
    }
}
