import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task5;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task5Test {

    int number;
    boolean result;

    public Task5Test(int number, boolean result) {
        this.number = number;
        this.result = result;
    }

    @Parameters
    public static Collection<Object[]> Task5Parameters() {
        return Arrays.asList(new Object[][]{
                {6, true},
                {28, true},
                {45, false},
                {8128, true},
        });
    }

    @Test
    public void perfectNumberTest() {
        boolean expected = result;
        boolean actual = Task5.isPerfect(number);
        Assert.assertEquals(expected, actual);
    }
}