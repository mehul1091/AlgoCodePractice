import com.arrays.PairOfValuesInTwoArraysWithSmallestDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairOfValuesInTwoArraysWithSmallestDifferenceTest {

    PairOfValuesInTwoArraysWithSmallestDifference obj;
    List<TestCasePair> testCases;

    @BeforeEach
    void setUp() {
        testCases = new ArrayList<>();
        obj = new PairOfValuesInTwoArraysWithSmallestDifference();
        testCases.add(new TestCasePair(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8}, 3));
        testCases.add(new TestCasePair(new int[]{10,5,40}, new int[]{50, 90, 80}, 10));
        testCases.add(new TestCasePair(new int[]{1, 2, 11, 15, 12}, new int[]{4, 12, 19, 23, 127, 235}, 0));
    }

    @Test
    void solve() {
        testCases.forEach(testCasePair -> {
            int result = obj.solve(testCasePair.getA(), testCasePair.getB());
            Assertions.assertEquals(testCasePair.result, result);
        });
    }
}