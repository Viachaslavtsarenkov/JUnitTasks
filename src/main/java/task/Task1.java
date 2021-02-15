package task;

public class Task1 {

    public static int getLastDigitOfSquare(int number) {
        return (int) Math.pow(number % 10, 2) % 10;
    }
}
