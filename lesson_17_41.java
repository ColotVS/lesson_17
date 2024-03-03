import java.time.LocalTime;

public class lesson_17_41 {
    //Получение заданного времени

    //Чтобы получить заданное время, нужно воспользоваться статическим методом of().
    //Пример:
    //LocalTime time = LocalTime.of(часы, минуты, секунды, наносекунды);
    //В который можно передать соответственно часы, минуты, секунды и наносекунды.

    //Пример:
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 15, 0, 100);
        System.out.println("Сейчас = " + time);         //Вывод на экран: Сейчас = 12:15:00.000000100
    }
}
