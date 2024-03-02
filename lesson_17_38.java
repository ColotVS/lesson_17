import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class lesson_17_38 {
    //Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
    //Воспользуйся методами getDayOfWeek и getDisplayName.

    static LocalDate birthDate = LocalDate.of(1998, 5, 23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
