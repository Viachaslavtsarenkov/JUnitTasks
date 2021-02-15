import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task.Task4;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task4Test {

    int a,b,c,d;
    boolean result;

    public Task4Test(int a, int b, int c, int d, boolean result) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> evenValues() {
        return Arrays.asList(new Object[][] {
            {1, 2, 3, 4, true },
            {1, 33, 44, 5, false},
            {12, 11, 1, 16, true},
            {123, 56 , 77, 39, false},
        });
    }

    @Test
    public void countTest() {
        boolean expected = result;
        boolean actual = Task4.count(a, b, c, d);
        Assert.assertEquals(expected, actual);
    }
}