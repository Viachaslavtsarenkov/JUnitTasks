import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task1;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {
    private int number;
    private int square;

    public Task1Test(int number, int square) {
        this.number = number;
        this.square = square;
    }

    @Parameters
    public static Collection<Object[]> squaresOfLastDigit() {
        return Arrays.asList(new Object[][]{
                {23, 9},
                {144, 6},
                {2345, 5}
        });
    }

    @Test
    public void squareOfLastDigitTest() {
        int expected = square;
        int actual = Task1.getLastDigitOfSquare(number);
        Assert.assertEquals(expected,actual);
    }
}
