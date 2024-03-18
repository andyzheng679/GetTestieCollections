package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void treeMapTest(){
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("dec", "December");
        Assert.assertEquals(String.valueOf("December"), treeMap.get("dec"));
    }

    @Test
    public void treeMapTest2(){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(7, 777);
        Assert.assertEquals(Integer.valueOf(777), treeMap.get(7));
    }
}
