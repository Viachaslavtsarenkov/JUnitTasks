package task;

public class Task6 {

    static public int getHours(int seconds) {
        return (seconds / 3600);
    }

    static public int getMinutes(int seconds) {
        return (seconds % 3600) / 60;
    }

    static public int getSeconds(int seconds) {
        return (seconds % 3600) % 60;
    }
}
