import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import task.Task2;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2Test {

    private int month;
    private int year;
    private int amountDays;
    private boolean leap;

    public Task2Test( int year, int month, int amountDays, boolean leap) {
        this.month = month;
        this.year = year;
        this.amountDays = amountDays;
        this.leap = leap;
    }

    @Test
    public void isLeapTest() {
        boolean expected = leap;
        boolean actual = Task2.isLeap(year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfDaysTest() {
        int expected = amountDays;
        int actual = Task2.getAmountDays(month, year);
        Assert.assertEquals(expected, actual, 7);
    }

    @Parameters
    public static Collection<Object[]> leapParameters() {
        return Arrays.asList(new Object[][] {
                {1900, 1, 31, false},
                {1904, 4, 30, true},
                {2000, 2, 29, true},
                {2003, 3, 31, false}
        });
    }


}
