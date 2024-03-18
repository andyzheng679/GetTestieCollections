package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void linkedListTest(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Andy");
        linkedList.add("Zheng");

        Assert.assertEquals("Andy", linkedList.get(0));
        linkedList.removeLast();
        Assert.assertFalse(linkedList.contains("Zheng"));

    }

    @Test
    public void linkedListTest2(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);

        Assert.assertEquals(1, (int) linkedList.get(0));
        linkedList.removeLast();
        Assert.assertFalse(linkedList.contains(7));

    }
}
