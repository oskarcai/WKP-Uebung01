package A2;

public class Hours implements TimeUnit {
    private int hours;

    public Hours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSeconds() {
        return hours * 60 * 60;
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
}
