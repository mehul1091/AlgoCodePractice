import com.doubly.linkedlist.DoublyLinkedList;
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
        dll.insertAtEnd(6);
        dll.insertAtBeginning(7);
        dll.insertAtBeginning(1);
        dll.insertAtEnd(4);
        dll.insertAfterNode(dll.getHead().getNext(), 8);
        dll.insertBeforeNode(dll.getHead().getNext().getNext(), 5);
        // list becomes 1->7->5->8->6->4
        dll.printList();

    }
}