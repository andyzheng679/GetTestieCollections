package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void hashMapTest(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("dec", "December");
        hashMap.put("nov", "Novemver");

        Assert.assertEquals("December", hashMap.get("dec"));
        hashMap.remove("nov");
        Assert.assertFalse(hashMap.containsKey("nov"));
    }

    @Test
    public void hashMapTest2(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(100, 200);
        hashMap.put(101, 300);

        Assert.assertEquals(200, (int) hashMap.get(100));
        hashMap.remove(101);
        Assert.assertFalse(hashMap.containsKey(101));
    }
}
