import com.arrays.ThreeSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    ThreeSum threeSum;

    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void threeSum() {
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        System.out.println(lists);
    }

    @Test
    void threeSumZerors() {
        List<List<Integer>> lists = threeSum.threeSum(new int[]{0,0,0,0});

        System.out.println(lists);
    }

}