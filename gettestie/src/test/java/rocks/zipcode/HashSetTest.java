package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    @Test
    public void hashSetTest(){
        Set<String> hashset = new HashSet<>();
        hashset.add("Andy");
        hashset.add("Zheng");
        hashset.remove("Zheng");

        Assert.assertTrue(hashset.contains("Andy"));
        Assert.assertFalse(hashset.contains("Zheng"));
    }

}
