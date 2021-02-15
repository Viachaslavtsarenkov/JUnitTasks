import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task6;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task6Test {

    int allSeconds;
    int minutes;
    int hours;
    int seconds;

    public Task6Test(int allSeconds, int hours, int minutes, int seconds) {
        this.allSeconds = allSeconds;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Parameters
    public static Collection<Object[]> secondsParameters() {
        return Arrays.asList(new Object[][] {
                {7234, 2, 0, 34},
                {3725, 1, 2, 5},
                {325, 0, 5, 25},
                {7349, 2, 2, 29}
        });
    }

    @Test
    public void secondsTest() {
        int expected = seconds;
        int actual = Task6.getSeconds(allSeconds);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minutesTest() {
        int expected = minutes;
        int actual = Task6.getMinutes(allSeconds);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hoursTest() {
        int expected = hours;
        int actual = Task6.getHours(allSeconds);
        Assert.assertEquals(expected, actual);
    }


}