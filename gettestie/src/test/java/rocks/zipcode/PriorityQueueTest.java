package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void priorityQueueTest(){
        PriorityQueue<String> priorityQueueTest = new PriorityQueue<>();
        priorityQueueTest.add("Zheng");
        priorityQueueTest.add("Testing");
        priorityQueueTest.add("Andy");

        Assert.assertEquals("Andy", priorityQueueTest.peek());      //case sensitive
        Assert.assertEquals("Andy", priorityQueueTest.poll());
        Assert.assertEquals("Testing", priorityQueueTest.peek());
    }

    @Test
    public void priorityQueueTest2(){
        PriorityQueue<Integer> priorityQueueTest = new PriorityQueue<>();
        priorityQueueTest.add(49);
        priorityQueueTest.add(100);
        priorityQueueTest.add(76);

        Assert.assertEquals(49, (int) priorityQueueTest.peek());
        Assert.assertEquals(49, (int) priorityQueueTest.poll());
        Assert.assertEquals(76, (int) priorityQueueTest.peek());
    }
}
