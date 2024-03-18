package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ComparableTest {

    @Test
    public void comparableTest(){
        List<String> comparableTest = new ArrayList<>();
        comparableTest.add("Zheng");
        comparableTest.add("wut");
        comparableTest.add("hmm");
        comparableTest.add("Andy");

        Collections.sort(comparableTest);
        Assert.assertEquals(Arrays.asList("Andy", "Zheng", "hmm", "wut"), comparableTest);
    }

    @Test
    public void comparableTest2(){
        List<Integer> comparableTest = new ArrayList<>();
        comparableTest.add(5);
        comparableTest.add(94);
        comparableTest.add(37);
        comparableTest.add(9);

        Collections.sort(comparableTest);
        Assert.assertEquals(Arrays.asList(5,9,37,94), comparableTest);
    }
}
