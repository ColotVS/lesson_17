import java.time.Instant;

public class lesson_17_52 {
    //В классе Solution реализуй три метода:

    //в методе getMaxFromMilliseconds верни максимальный Instant,
    //который можно получить с помощью метода ofEpochMilli(long milliseconds);

    //в методе getMaxFromSeconds верни максимальный Instant,
    //который можно получить с помощью метода ofEpochSecond(long seconds);

    //в методе getMaxFromSecondsAndNanos верни максимальный Instant,
    //который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());       //+292278994-08-17T07:12:55.807Z
        System.out.println(getMaxFromSeconds());            //+1000000000-12-31T23:59:59Z
        System.out.println(getMaxFromSecondsAndNanos());    //+1000000000-12-31T23:59:59.999999999Z
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(),999999999);
    }
}
