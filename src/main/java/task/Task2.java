package task;

public class Task2 {
    static final private int[] AMOUNT_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30 ,31};

    static public boolean isLeap(int year) {
        return (year % 4 == 0
                && (year % 400 == 0
                || year % 100 != 0));
    }

    static public int getAmountDays(int month, int year) {
        return (isLeap(year) && month == 2)
                ? 29
                : AMOUNT_DAYS[month - 1];
    }
}
