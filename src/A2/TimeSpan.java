package A2;

public class TimeSpan implements TimeUnit {
    private Hours hours;
    private Minutes minutes;
    private Seconds seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = new Hours(hours);
        this.minutes = new Minutes(minutes);
        this.seconds = new Seconds(seconds);
    }

    @Override
    public int getSeconds() {
        return this.hours.getSeconds() + this.minutes.getSeconds() + this.seconds.getSeconds();
    }
}
