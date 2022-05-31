import com.arrays.FindDuplicateNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateNumberTest {

    List<TestCase> testCases;
    FindDuplicateNumber findDuplicateNumber;

    @BeforeEach
    void setUp() {
        testCases = new ArrayList<>();
        findDuplicateNumber = new FindDuplicateNumber();
        testCases.add(new TestCase(new int[]{1,3,4,2,2}, new int[]{2}));
        testCases.add(new TestCase(new int[]{3,1,3,4,2}, new int[]{3}));
        testCases.add(new TestCase(new int[]{1,2,2,4,3}, new int[]{2}));
        testCases.add(new TestCase(new int[]{1,2,1,4,3}, new int[]{1}));
        testCases.add(new TestCase(new int[]{1,2,1}, new int[]{1}));
        testCases.add(new TestCase(new int[]{1,2,1,3,4,5,6}, new int[]{1}));
    }

    @Test
    void solve() {
        testCases.forEach(testCase -> {
            int result = findDuplicateNumber.solve(testCase.getInput());
            Assertions.assertArrayEquals(testCase.getOutput(), new int[]{result});
        });
    }
}