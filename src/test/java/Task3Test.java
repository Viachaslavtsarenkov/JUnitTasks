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

    public Task3Test(int firstArea, secondArea) {
        this.firstArea = firstArea;
        this.secondArea = secondArea;
    }

    @Parameters
    public static Collection<Object[]> firstAreaValues() {
        return Arrays.asList(new Object[][]{
                {12, 6},
                {132, 66},
                {127, 63.5},
                {1239, 619.5}
        });
    }

    @Test
    public void secondAreaTest() {
        double expected = secondArea;
        double actual = Task3.getSecondAreaSquare(firstArea);
        Assert.assertEquals(expected, actual, 4);
    }
}