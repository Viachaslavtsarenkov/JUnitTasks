import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task7;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task7Test {

    int x1, x2, y1, y2;
    boolean result;

    public Task7Test(int x1, int y1, int x2, int y2, boolean result) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> task7Parameters() {
        return Arrays.asList(new Object[][] {
                {1, 1, 2, 1, true},
                {3, 2, 2, 0, false},
                {5, 5, -2, 1, false},
                {1, 0, 0, 1, false},
                {5, 5, -2, 1, false},
        });
    }

    @Test
    public void pointsTest() {
        boolean expected = result;
        boolean actual = Task7.comparePoints(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
}
