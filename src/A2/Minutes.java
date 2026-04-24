package A2;

public class Minutes implements TimeUnit {
    private int minutes;

    public Minutes(int number) {
        this.minutes = minutes;
    }

    @Override
    public int getSeconds() {
        return minutes * 60;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
