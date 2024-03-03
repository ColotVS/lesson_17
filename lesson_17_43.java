import java.time.LocalTime;

public class lesson_17_43 {
    //Получение фрагментов времени

    //Чтобы из объекта LocalTime получить значение определенного элемента времени, используют специальные методы:
    //Метод	            Описание
    //int getHour()     Возвращает часы
    //int getMinute()   Возвращает минуты
    //int getSecond()   Возвращает секунды
    //int getNano()     Возвращает наносекунды

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
    }
}
