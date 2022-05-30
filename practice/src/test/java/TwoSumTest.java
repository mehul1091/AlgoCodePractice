
import com.arrays.TwoSum;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TwoSumTest {

    @Data
    @AllArgsConstructor
    class TestCase{
        int[] input;
        int target;
        int[] output;
    }

    TwoSum twoSum;
    List<TestCase> testCases;

    @BeforeAll
    void initTestCases(){
        twoSum = new TwoSum();
        testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{3,3}, 6, new int[]{0,1}));
        testCases.add(new TestCase(new int[]{2,7,11,15}, 9, new int[]{0,1}));
        testCases.add(new TestCase(new int[]{3,2,4}, 6, new int[]{1,2}));
    }

    @Test
    void solveMethod1() {
        testCases.forEach(testCase -> {
            int[] result = twoSum.solveMethod1(testCase.getInput(), testCase.getTarget());
            Assertions.assertArrayEquals(testCase.getOutput(), result);
        });
    }

    @Test
    void solveBestMethod() {
        testCases.forEach(testCase -> {
            int[] result = twoSum.solveBestMethod(testCase.getInput(), testCase.getTarget());
            Assertions.assertArrayEquals(testCase.getOutput(), result);
        });
    }
}


