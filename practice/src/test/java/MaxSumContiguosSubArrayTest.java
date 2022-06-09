import com.arrays.MaxSumContiguosSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumContiguosSubArrayTest {

    MaxSumContiguosSubArray obj;
    List<TestCase> testCases;

    @BeforeEach
    void setUp() {
        obj = new MaxSumContiguosSubArray();
        testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{-2,1,-3,4,-1,2,1,-5,4}, new int[]{6}));
        testCases.add(new TestCase(new int[]{1,2,3,-2,5}, new int[]{9}));
    }

    @Test
    void solve() {
        testCases.forEach(testCase -> {
            int result = obj.solve(testCase.getInput());
            Assertions.assertArrayEquals(testCase.getOutput(), new int[]{result});
        });
    }
}