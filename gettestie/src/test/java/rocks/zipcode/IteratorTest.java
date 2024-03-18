package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void iteratorTest(){
        List<String> iteratorTest = new ArrayList<>();
        iteratorTest.add("Andy");
        iteratorTest.add("Zheng");
        //iteratorTest.add("testing");

        Iterator<String> iterator = iteratorTest.iterator();

        Assert.assertEquals("Andy", iterator.next());
        Assert.assertEquals("Zheng", iterator.next());
    }

    @Test
    public void iteratorTest2(){
        List<Integer> iteratorTest = new ArrayList<>();
        iteratorTest.add(77);
        iteratorTest.add(93);
        //iteratorTest.add("testing");

        Iterator<Integer> iterator = iteratorTest.iterator();

        Assert.assertEquals(77, (int) iterator.next());
        Assert.assertEquals(93, (int) iterator.next());
    }
}
