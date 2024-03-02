import java.time.LocalDate;

public class lesson_17_36 {
    //Изменение даты в объекте LocalDate

    //Класс LocalDate содержит несколько методов, которые позволяют работать с датой.
    //Эти методы реализованы по аналогии с методами класса String:
    //каждый из этих методов не меняет существующий объект LocalDate, а возвращает новый с нужными данными.
    //Вот какие методы есть у класса LocalDate:

    //Метод         	        Описание
    //plusDays(int days)        Добавляет определенное количество дней к дате
    //plusWeeks(int weeks)      Добавляет недели к дате
    //plusMonths(int months)    Добавляет месяцы к дате
    //plusYears(int years)      Добавляет годы к дате
    //minusDays(int days)       Отнимает дни от даты
    //minusWeeks(int weeks)     Отнимает недели от даты
    //minusMonths(int months)   Отнимает месяцы от даты
    //minusYears(int years)     Отнимает годы от даты

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2024, 5, 23);
        LocalDate nextBirthday = birthday.plusYears(1);
        LocalDate firstBirthday = birthday.minusYears(26);

        System.out.println("Ближайший день рождения: " + birthday);
        System.out.println("Следующий день рождения: " + nextBirthday);
        System.out.println("Самый первый день рождения: " + firstBirthday);
    }
}
