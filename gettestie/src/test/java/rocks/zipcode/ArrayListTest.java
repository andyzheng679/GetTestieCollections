package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

    @Test
    public void arrayListTest(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Andy");
        arrayList.add("Zheng");

        Assert.assertEquals("Andy", arrayList.get(0));
        arrayList.set(1, "test");
        Assert.assertEquals("test", arrayList.get(1));
    }

    @Test
    public void arrayListTest2(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(7);

        Assert.assertEquals(1, (int) arrayList.get(0));
        arrayList.set(1, 13);
        Assert.assertEquals(13, (int) arrayList.get(1));
    }

}
