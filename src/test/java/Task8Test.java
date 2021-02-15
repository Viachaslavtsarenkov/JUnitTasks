import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task.Task8;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task8Test {
    int x;
    double result;

    public Task8Test(int x, double result) {
        this.x = x;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> task8Parameters() {
        return Arrays.asList(new Object[][] {
            {3, 9},
            {5, -1},
            {1, -0.2},
            {2, 0.5}
        });
    }

    @Test
    public void fXTest() {
        double expected = result;
        double actual = Task8.getValueFunction(x);
        Assert.assertEquals(expected, actual, 3);
    }
}
