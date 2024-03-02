import java.time.LocalDate;
import java.time.ZoneId;

public class lesson_17_33 {
    //Класс LocalDate

    //Первый и самый полезный класс из Date Time API, который мы изучим — это класс LocalDate.
    //Как вы, скорее всего, догадываетесь по его названию, этот класс создан для работы с датой.
    //Объекты этого класса не изменяются после создания (класс LocalDate immutable).
    //Зато это добавило классу простоты и надежности.
    //Особенно если с объектом класса одновременно взаимодействуют несколько нитей (потоков исполнения).

    //Чтобы создать новый объект класса LocalDate, нужно использовать один из статических методов. Вот список основных.

    //Получение текущей даты
    //Чтобы получить текущую дату, нужно воспользоваться статическим методом now(). Это гораздо проще, чем кажется:
    //LocalDate today = LocalDate.now();

    //Где today — это переменная класса LocalDate, а LocalDate.now() — вызов статического метода now() у класса LocalDate.

    //Получение даты в определенном часовом поясе
    //Также у класса LocalDate есть разновидность метода now(ZoneId), который позволяет получить текущую дату в определенном часовом поясе.
    //Для этого нам понадобится еще один класс — ZoneId (java.time.ZoneId).
    //У него есть метод of(), который возвращает объект ZoneId по имени часового пояса.
    //Чтобы определить текущую дату в Шанхае, нужно написать код:
    //ZoneId  timezone = ZoneId.of("Asia/Shanghai");
    //LocalDate today = LocalDate.now(timezone);
    //System.out.println("Сейчас в Шанхае = " + today);


    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня = " + today);
        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        today = LocalDate.now(timezone);
        System.out.println("Сейчас в Шанхае = " + today);
    }
}
