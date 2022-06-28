import com.cache.LRUCache;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

//    LRUCache lruCache;
//    LRUCacheWithInBuilt lruCache;
    LRUCache lruCache;

    @BeforeEach
    void setUp() {

//        lruCache=new LRUCacheWithInBuilt(2);
    }

    @Test
    void test() {
        lruCache=new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        Assertions.assertEquals(1, lruCache.get(1));
        lruCache.put(3,3);
        Assertions.assertEquals(-1, lruCache.get(2));
        lruCache.put(4,4);
        Assertions.assertEquals(-1, lruCache.get(1));
        Assertions.assertEquals(3, lruCache.get(3));
        Assertions.assertEquals(4, lruCache.get(4));

    }

    @Test
    void test2(){
        lruCache=new LRUCache(1);
        lruCache.put(2,1);
        Assertions.assertEquals(1, lruCache.get(2));
    }

    @Test
    void test3(){
        lruCache=new LRUCache(2);
        Assertions.assertEquals(-1, lruCache.get(2));
        lruCache.put(2,6);
        Assertions.assertEquals(-1, lruCache.get(1));
        lruCache.put(1,5);
        lruCache.put(1,2);
        Assertions.assertEquals(2, lruCache.get(1));
        Assertions.assertEquals(6, lruCache.get(2));
    }
}