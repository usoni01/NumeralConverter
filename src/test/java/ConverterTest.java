import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConverterTest {


    @Test
    public void testOneToI(){
        int input = 1;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("I", result);
    }

    @Test
    public void testTwoToII(){
        int input = 2;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("II", result);
    }

    @Test
    public void testThreeToIII(){
        int input = 3;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("III", result);
    }

    @Test
    public void testFourToIV(){
        int input = 4;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void testFiveToV(){
        int input = 5;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("V", result);
    }

    @Test
    public void testSixToIII(){
        int input = 6;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("VI", result);
    }

    @Test
    public void testSevenToVII(){
        int input = 7;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("VII", result);
    }

    @Test
    public void testEightToVIII(){
        int input = 8;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("VIII", result);
    }

    @Test
    public void testNineToIX(){
        int input = 9;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("IX", result);
    }

    @Test
    public void testTenToX(){
        int input = 10;

        String result;
        result = NumeralConverter.convert(input);
        Assert.assertEquals("X", result);
    }

    @Test
    public void converterTest(){
        List<Integer> input = new ArrayList<>();
        List<String> output = new ArrayList<>();
        String result;
        for(int i = 0; i<13 ;i++){
            input.add(i+1);
        }
        output.add("I"); output.add("II"); output.add("III");
        output.add("IV"); output.add("V"); output.add("VI");
        output.add("VII"); output.add("VIII"); output.add("IX");
        output.add("X"); output.add("XI"); output.add("XII");output.add("XIII");

        for(int x=0; x<10; x++){
            result = NumeralConverter.convert(input.get(x));
            Assert.assertEquals(output.get(x), result);
        }

    }


}
