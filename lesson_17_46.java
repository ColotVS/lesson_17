import java.time.LocalTime;

public class lesson_17_46 {
    //Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран вывелись 4 строки.
    //Изменения можно вносить только в метод amazingMethod.
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        if (base.getHour() == 0||base.getHour() == 6||base.getHour() == 12) {
            return base.plusHours(6);
        }
        else if(base.getHour() == 18 || base.getHour() == 21)
            return base.plusHours(3);

        return base;
    }
}
