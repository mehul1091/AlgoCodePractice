import com.arrays.SquaresOfSortedArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SquaresOfSortedArrayTest {

    @Data
    @AllArgsConstructor
    class TestCase{
        int[] input;
        int[] output;
    }

    SquaresOfSortedArray squaresOfSortedArray;
    List<TestCase> testCases;

    @BeforeAll
    void init(){
        squaresOfSortedArray = new SquaresOfSortedArray();
        testCases = new ArrayList<>();
        testCases.add(new TestCase(new int[]{-4, -1, 0, 3, 10}, new int[]{0,1,9,16,100}));
        testCases.add(new TestCase(new int[]{-7,-3,2,3,11}, new int[]{4,9,9,49,121}));
    }

    @Test
    void solve() {
        testCases.forEach(testCase -> {
            int[] result = squaresOfSortedArray.solve(testCase.getInput());
            Assertions.assertArrayEquals(testCase.getOutput(), result);
        });
    }
}