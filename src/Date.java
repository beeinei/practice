import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date {
    //Attributes
    int day;
    int month;
    int year;

    //Constructors
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        GregorianCalendar today = new GregorianCalendar();
        this.day = today.get(Calendar.DAY_OF_MONTH);
    }

    //Methods
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        year = this.year;
    }

    public void setMonth(int month) {
        month = this.month;
    }

    public void setDay(int day) {
        day = this.day;
    }

    public Date getTomorrow() {
        Date t = new Date(this.day + 1, this.month, this.year);
        if (t.day > 31) {
            t.day = t.day % 31;
            t.month = this.month + 1;
        }
        if (t.month > 12) {
            t.month = t.month % 12;
            t.year = this.year + 1;
        }
        return t;
    }

    public int compareTo(Date d) {
        int yearDiff = d.year - this.year;
        int monthDiff = d.month - this.month;
        int dayDiff = d.day - this.day;

        int overallDaysDiff = yearDiff * (31 * 12) + monthDiff * 31 + dayDiff;
        return overallDaysDiff;
    }

    public String toString() {
        return "" + day + "," + month + "," + year;
    }

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Insert a positive integer for the amount of days you would like to add!");
        int x = (int)reader.nextDouble();
        if (x < 0) {
            System.out.println("Your number is negative. Insert a *positive* integer for the amount of days you would like to add!");
        }
        Date today = new Date(8, 12, 2017);
        Date d = new Date(8, 12, 2017);
        while (today.compareTo(d) < x) {
            d = d.getTomorrow();
        }
        System.out.println(d.toString());
    }
}
