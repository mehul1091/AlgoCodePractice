import com.arrays.ProductofElementExceptItself;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductofElementExceptItselfTest {

    ProductofElementExceptItself obj;
    List<TestCase> testcases;

    @BeforeEach
    void setUp() {
        obj = new ProductofElementExceptItself();
        testcases = new ArrayList<>();
        testcases.add(new TestCase(new int[]{1,2,3,4}, new int[]{24,12,8,6}));
        testcases.add(new TestCase(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0}));
    }

    @Test
    void solve() {
        testcases.forEach(testCase -> {
            int[] result = obj.solve(testCase.getInput());
            Assertions.assertArrayEquals(testCase.getOutput(), result);
        });
    }
}