package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void treeSetTest(){
        TreeSet<String> treeSetTest = new TreeSet<>();
        treeSetTest.add("zheng");
        treeSetTest.add("andy");
        treeSetTest.add("idk");

        Assert.assertEquals("zheng", treeSetTest.last());       //case sensitive
        Assert.assertEquals("andy", treeSetTest.first());
    }

    @Test
    public void treeSetTest2(){
        TreeSet<Integer> treeSetTest = new TreeSet<>();
        treeSetTest.add(6);
        treeSetTest.add(28);
        treeSetTest.add(2);

        Assert.assertEquals(28, (int) treeSetTest.last());
        Assert.assertEquals(2, (int) treeSetTest.first());
    }
}
