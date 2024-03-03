import java.time.LocalTime;

public class lesson_17_42 {
    //Получение времени по номеру секунды

    //Также можно получить время по номеру секунды в сутках: для этого есть специальный статический метод ofSecondOfDay():
    //LocalTime time = LocalTime.ofSecondOfDay(секунды);
    //Где секунды — это количество секунд, прошедшее с начала суток.

    public static void main(String[] args) {
        LocalTime time = LocalTime.ofSecondOfDay(10000);
        System.out.println(time);                           //02:46:40
    }
}
