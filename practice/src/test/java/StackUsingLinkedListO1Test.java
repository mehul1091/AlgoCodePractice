import com.stack.StackUsingLinkedList;
import com.stack.StackUsingLinkedListO1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackUsingLinkedListO1Test {

    StackUsingLinkedListO1 stack;

    @BeforeEach
    void setUp() {
        stack=new StackUsingLinkedListO1();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(-1, stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Assertions.assertEquals(4, stack.pop());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        stack.push(10);
        Assertions.assertEquals(10, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(-1, stack.pop());
    }
}