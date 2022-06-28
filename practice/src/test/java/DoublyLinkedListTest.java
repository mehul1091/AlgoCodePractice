import com.cache.DoublyLinkedList;
import com.cache.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList dll;

    @BeforeEach
    void setUp() {
        dll=new DoublyLinkedList();
    }

    @Test
    public void testDll(){
        dll.insertAtEnd(new Node(6));
        dll.insertAtBeginning(new Node(7));
        dll.insertAtBeginning(new Node(1));
        dll.insertAtEnd(new Node(4));
        dll.insertAfterNode(dll.getHead().getNext(), new Node(8));
        dll.insertBeforeNode(dll.getHead().getNext().getNext(), new Node(5));
        // list becomes 1->7->5->8->6->4
//        dll.printList();

    }
}