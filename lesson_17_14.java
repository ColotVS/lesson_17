import java.util.Date;

public class lesson_17_14 {
    //Работа с фрагментами даты

    //Объект Date можно не просто выводить на экран. У него есть методы, которые позволяют получить отдельные фрагменты его даты:

    //Метод	            Описание
    //int getYear()     Возвращает год даты относительно 1900 года.
    //int getMonth()    Возвращает месяц даты, месяцы нумеруются с нуля
    //int getDate()     Возвращает день месяца
    //int getDay()      Возвращает день недели
    //int getHours()    Возвращает часы
    //int getMinutes()  Возвращает минуты
    //int getSeconds()  Возвращает секунды

    public static void main(String[] args) {
        Date current = new Date();
        System.out.println(current.getYear());      //124       2024 год
        System.out.println(current.getMonth());     //2         Март
        System.out.println(current.getDate());      //1         день месяца
        System.out.println(current.getDay());       //5         день недели (пятница)
    }

}
