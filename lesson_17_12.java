import java.util.Date;

public class lesson_17_12 {
    //Задание определенной даты

    //Как получить текущее время мы разобрались, а как создать объект Date, который бы содержал другую дату или время?
    //Тут тоже все просто. Чтобы задать определенный день, нужно написать код вида:
    //Date birthday = new Date(год, месяц, день);

    //Все просто и очевидно, но есть два нюанса:
    //1-Год нужно задавать от 1900.
    //2-Месяцы нумеруются с нуля.

    public static void main(String[] args) {
        Date birthday = new Date(98,4,23);
        System.out.println(birthday);                           //Вывод: Sat May 23 00:00:00 GMT+07:00 1998 мой день рождения
    }

}
