package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    @Test
    public void arrayDequeTest(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("Andy");
        arrayDeque.addLast("Zheng");

        Assert.assertEquals("Andy", arrayDeque.getFirst());


    }

    @Test
    public void arrayDequeTest2(){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addLast(7);

        Assert.assertEquals(7, (int) arrayDeque.getLast());


    }
}
