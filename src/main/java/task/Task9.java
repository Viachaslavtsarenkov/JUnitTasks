package task;
import java.util.ArrayList;

public class Task9 {
    public static ArrayList<Double> getTan(double a, double b, double h) {
        ArrayList<Double>  intervalValues = new ArrayList<Double>();
        for(double i = a; i <= b; i += h) {
            intervalValues.add(Math.tan(i));
        }
        return intervalValues;
    }
}
