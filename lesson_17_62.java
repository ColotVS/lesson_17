import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lesson_17_62 {
    //В методе main выведи на экран переменную localDateTime в таком виде:
    //05.03.2024г. 11ч.45мин

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String txt = date.format(localDateTime);
        System.out.println(txt);                        //05.03.2024г. 11ч.45мин
    }
}
