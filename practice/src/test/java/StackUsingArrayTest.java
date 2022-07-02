import com.stack.StackUsingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingArrayTest {

    StackUsingArray stack;
    @BeforeEach
    void setUp() {
        stack=new StackUsingArray(3);
    }

    @Test
    public void test1(){
        Assertions.assertEquals(-1, stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);//error
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        stack.push(10);
        Assertions.assertEquals(10, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(-1, stack.pop());
    }
}