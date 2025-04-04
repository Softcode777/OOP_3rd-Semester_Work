package LAB_Assignment_2;
public class S1_Time {
    private int hours;
    private int minutes;
    private int seconds;

    public S1_Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public S1_Time(int h, int m, int s) {
        if (isValidTime(h, m, s)) {
            this.hours = h;
            this.minutes = m;
            this.seconds = s;
        } else {
            System.out.println("Invalid time input! Setting to default (00:00:00).");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
    }
    public void displayTime() {
        System.out.printf("Current time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

}