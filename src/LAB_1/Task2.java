package LAB_1;//class LAB_1.Time {
//    int Hours;
//    int Minutes;
//    int Seconds;
//    String period;
//    String Timezone;
//
//
//    public void displaytime() {
//        System.out.println("LAB_1.Time in this timezone " + Timezone + " is " + Hours + ":"+ Minutes + ":" + Seconds + period );
//    }
//
//    public void
//}
//public class LAB_1.Task2 {
//    public static void main(String[] args) {
//        LAB_1.Time time1 = new LAB_1.Time();
//        time1.Hours= 8;
//        time1.Minutes= 30;
//        time1.Seconds= 45;
//        time1.period= "Am";
//        time1.Timezone= "GMT+5";
//
//   time1.displaytime();
//
//    }
//}



//              ((((((((((((((CHATGPT))))))))))

class Time {
    int hours;        // Stores the hour (0-23 for 24-hour format or 1-12 for 12-hour format)
    int minutes;      // Stores the minutes (0-59)
    int seconds;      // Stores the seconds (0-59)
    String period;    // Stores AM/PM for 12-hour format
    String timeZone;  // Stores the time zone (optional, e.g., "PST", "UTC")

    // Constructor to initialize time
    public Time(int hours, int minutes, int seconds, String period, String timeZone) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.period = period;
        this.timeZone = timeZone;
    }

    // Method to set time
    public void setTime(int hours, int minutes, int seconds, String period, String timeZone) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.period = period;
        this.timeZone = timeZone;
    }

    // Method to get time as a formatted string
    public String getTime() {
        return String.format("%02d:%02d:%02d %s %s", hours, minutes, seconds, period, timeZone);
    }

    // Method to display time
    public void displayTime() {
        System.out.println("Current LAB_1.Time: " + getTime());
    }

    // Method to convert 24-hour format to 12-hour format
    public void convertTo12Hour() {
        if (hours == 0) {
            hours = 12;
            period = "AM";
        } else if (hours == 12) {
            period = "PM";
        } else if (hours > 12) {
            hours -= 12;
            period = "PM";
        } else {
            period = "AM";
        }
    }

    // Method to convert 12-hour format to 24-hour format
    public void convertTo24Hour() {
        if (period.equals("PM") && hours < 12) {
            hours += 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }
        period = ""; // No AM/PM needed in 24-hour format
    }

    // Method to add time (hours, minutes, seconds)
    public void addTime(int addHours, int addMinutes, int addSeconds) {
        seconds += addSeconds;
        minutes += seconds / 60;
        seconds %= 60;

        minutes += addMinutes;
        hours += minutes / 60;
        minutes %= 60;

        hours += addHours;
        hours %= 24; // Keeps hours within 0-23 range for 24-hour format
    }

    // Method to compare two time objects
    public int compareTime(Time other) {
        if (this.hours != other.hours) {
            return Integer.compare(this.hours, other.hours);
        } else if (this.minutes != other.minutes) {
            return Integer.compare(this.minutes, other.minutes);
        } else {
            return Integer.compare(this.seconds, other.seconds);
        }
    }
}

// LAB_1.Main class to test LAB_1.Time class
public class Task2{
    public static void main(String[] args) {
        // Creating a LAB_1.Time object
        Time t1 = new Time(14, 30, 45, "", "UTC"); // 2:30:45 PM in 24-hour format
        t1.convertTo12Hour();  // Convert to 12-hour format
        t1.displayTime();

        // Adding 2 hours, 40 minutes, and 30 seconds to the time
        t1.addTime(2, 40, 30);
        t1.displayTime();

        // Comparing two times
        Time t2 = new Time(17, 10, 20, "", "UTC");
        int result = t1.compareTime(t2);
        if (result < 0) {
            System.out.println("t1 is earlier than t2.");
        } else if (result > 0) {
            System.out.println("t1 is later than t2.");
        } else {
            System.out.println("Both times are equal.");
        }
    }
}
