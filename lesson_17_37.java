import java.time.LocalDate;

public class lesson_17_37 {
    //В классе lesson_17_37 реализуй 4 метода:

    //метод nowExample должен вернуть текущую дату;
    //остальные методы должны вернуть текущую дату, но разными способами.

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2024,3,2);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2024,62);
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(19784);
    }
}
