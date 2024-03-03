import java.time.LocalTime;

public class lesson_17_40 {
    //Современная работа со временем

    //Класс LocalTime

    //Класс LocalTime создан для случаев, когда нужно работать только со временем без даты.
    //Например, вы пишете приложение-будильник. Время для вас важно, а дата — нет.

    //Класс LocalTime очень похож на класс LocalDate: его объекты тоже нельзя изменять после создания.

    //Получение текущего времени
    //Чтобы создать новый объект класса LocalTime, нужно воспользоваться статическим методом now(). Пример:
    //LocalTime time = LocalTime.now();
    //Где time — это переменная класса LocalTime, а LocalTime.now() — вызов статического метода now() у класса LocalTime.

    //Пример:
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Сейчас = " + time);
    }

    //После точки указывается текущее значение наносекунд.
}
