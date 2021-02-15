import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task.Task9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class Task9Test {

    double a, b, h;
    ArrayList<Double> result;
    public Task9Test(double a, double b, double h, ArrayList<Double> result) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> intervalTanValues() {
        ArrayList<Double> testTanValues1 = new ArrayList<Double>();
        Collections.addAll(testTanValues1,1.5574077246549023, 14.101419947171719, -2.185039863261519);
        ArrayList<Double> testTanValues2 = new ArrayList<Double>();
        Collections.addAll(testTanValues2,1.5574077246549023, -4.286261674628062, -0.6015966130897586,
                0.26431690086742565, 1.7777797745088417, -3.380515006246586);
        ArrayList<Double> testTanValues3 = new ArrayList<Double>();
        Collections.addAll(testTanValues3,1.5574077246549023, -2.185039863261519,
                -0.1425465430742778, 1.1578212823495775, -3.380515006246586);
        return Arrays.asList(new Object[][] {
                {1,2, 0.5, testTanValues1},
                {1,5, 0.8, testTanValues2},
                {1,5, 1, testTanValues3}
        });
    }

    @Test
    public void intervalTanValuesTest() {
        ArrayList<Double> expected = result;
        ArrayList<Double> actual = Task9.getTan(a, b, h);
        Assert.assertEquals(expected, actual);
    }
}
