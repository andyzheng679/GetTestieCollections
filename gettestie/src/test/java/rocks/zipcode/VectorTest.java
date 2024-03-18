package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTest(){
        Vector<String> vector = new Vector<>();
        vector.add("Andy");
        vector.add("Zheng");

        Assert.assertEquals(String.valueOf("Andy"), vector.get(0));

    }

    @Test
    public void vectorTest2(){
        Vector<Integer> vector = new Vector<>();
        vector.add(77);
        vector.add(345);

        Assert.assertEquals(Integer.valueOf(345), vector.get(1));

    }
}
