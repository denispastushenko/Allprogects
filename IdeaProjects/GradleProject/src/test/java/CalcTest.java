import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void sum() throws Exception {
        Calc calc = new Calc();
        Assert.assertEquals(6, calc.sum(3, 3),0.1);

    }

}