import java.time.LocalDate;

public class lesson_17_35 {
    //Получение фрагментов даты

    //Изменять объекты класса LocalDate нельзя, а вот получать отдельные фрагменты даты еще как можно.
    //Для этого у объектов класса LocalDate есть несколько методов:

    //Метод	                        Описание
    //int getYear()                 Возвращает год из конкретной даты
    //Month getMonth()              Возвращает месяц даты — одну из специальных констант JANUARY, FEBRUARY, ...;
    //int getMonthValue()           Возвращает номер месяца из даты. Январь == 1.
    //int getDayOfMonth()           Возвращает номер дня в месяце
    //int getDayOfYear()            Возвращает номер дня с начала года
    //DayOfWeek getDayOfWeek()      Возвращает день недели: одну из специальных констант MONDAY, TUESDAY, ...;
    //IsoEra getEra()               Возвращает эру: константа BC (Before Current Era) и CE(Current Era)

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());        //2024
        System.out.println(today.getMonth());       //MARCH
        System.out.println(today.getMonthValue());  //3
        System.out.println(today.getDayOfMonth());  //2
        System.out.println(today.getDayOfYear());   //62
        System.out.println(today.getDayOfWeek());   //SATURDAY
        System.out.println(today.getEra());         //CE
    }
}
