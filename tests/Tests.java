import com.company.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {

    @Test
    public void test(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("My string");

        Assert.assertFalse(strings.isEmpty());
        Assert.assertEquals(1, strings.size());
        Assert.assertEquals("My string", strings.get(0));
        Assert.assertNotEquals("Mu string", strings.get(0));
    }

    @Test
    public void test2(){Assert.assertNotNull("Some wrong", null);}

    @Test
    public void shouldSumTwoValues(){
        Calculator calculator = new Calculator();
        int result = calculator.add(3,2);

        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldNotSumTwoValues(){
        Calculator calculator = new Calculator();
        int result = calculator.add(6,2);

        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldMultiplyTwoValues(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3,2);

        Assert.assertEquals(6, result);
    }

    @Test
    public void shouldDivideTwoValues(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(6,2);

        Assert.assertEquals(3, result);
    }

}
