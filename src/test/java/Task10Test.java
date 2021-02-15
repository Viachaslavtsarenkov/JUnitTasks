import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task.Task10;
import task.Task8;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task10Test {
    int radius;

    public Task10Test(int radius) {
        this.radius = radius;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> task10Parameters() {
        return Arrays.asList(new Object[][] {
                {1},
                {2},
                {3},
                {4}
        });
    }

    @Test
    public void setLengthCircleTest() {
        double expected = 2 * Math.PI * radius;
        double actual = Task10.getLengthCircle(radius);
        Assert.assertEquals(expected, actual, 3);
    }

    @Test
    public void areaCircleTest() {
        double expected = Math.PI * Math.pow(radius, 2);
        double actual = Task10.getAreaCircle(radius);
        Assert.assertEquals(expected, actual, 3);
    }
}
