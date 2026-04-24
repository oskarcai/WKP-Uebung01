package A2;

public class Seconds implements TimeUnit {
    private int seconds;

    public Seconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }
}
