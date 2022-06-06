import com.arrays.FourSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    FourSum fourSum;

    @BeforeEach
    void setUp() {
        fourSum = new FourSum();
    }

    @Test
    void fourSum() {
        System.out.println(fourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }

    @Test
    void fourSumTc2() {
        System.out.println(fourSum.fourSum(new int[]{2,2,2,2,2}, 8));
    }

    @Test
    void fourSumTc3() {
        System.out.println(fourSum.fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0));
    }

}