package task;

public class Task5 {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sum += i;
                if (sum > number) {
                    return false;
                }
            }
        }
        return (sum == number);
    }
}
