import java.util.Date;

public class lesson_17_13 {
    //Задание определенного времени

    //Задать определенное время тоже достаточно просто: для этого нужно написать команду вида:
    //Date birthday = new Date(год, месяц, день, час, минуты, секунды);
    //Часы, минуты и секунды нумеруются с нуля

    public static void main(String[] args) {
        Date current = new Date(105, 5, 4, 12, 15, 0);
        System.out.println(current);                                                    //Sat Jun 04 12:15:00 EEST 2005
    }
    //Мы задали время 12:15 и дату 4 июня 2005 года.
}
