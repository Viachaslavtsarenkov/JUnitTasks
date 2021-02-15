import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task3;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task3Test {

    private double firstArea;
    private double secondArea;

    public Task3Test(int firstArea) {
        this.firstArea = firstArea;
    }

    @Parameters
    public static Collection<Object[]> parametersTask2Test() {
        return Arrays.asList(new Object[][]{
                {12},
                {132},
                {127},
                {1239}
        });
    }

    @Test
    public void secondAreaTest() {
        double expected = firstArea / 2;
        double actual = Task3.getSecondAreaSquare(firstArea);
        Assert.assertEquals(expected, actual, 4);
    }
}