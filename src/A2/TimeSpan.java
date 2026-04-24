package A2;

public class TimeSpan implements TimeUnit {
    private Hours hours;
    private Minutes minutes;
    private Seconds seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours.setHours(hours);
        this.minutes.setMinutes(minutes);
        this.seconds.setSeconds(seconds);
    }

    @Override
    public int getSeconds() {
        return 0;
    }
}
