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
}