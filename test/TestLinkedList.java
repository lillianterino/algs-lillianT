package algs_lillianT.test;

import algs_lillianT.src.Data_Structures.LinkedList;
import algs_lillianT.src.Data_Structures.SinglyLinkedList;
import algs_lillianT.src.Data_Structures.DoublyLinkedList;
import algs_lillianT.src.Data_Structures.Node;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestLinkedList {

    static Stream<LinkedList<String, ?>> linkedLists(){
        return Stream.of(
                new SinglyLinkedList<>(),
                new DoublyLinkedList<>()
        );
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testGetters(LinkedList<String, ?> linkedList){
        // Empty
        assertNull(linkedList.getListHead());
        assertNull(linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 0);

        //Elements
        linkedList.insertAtHead( "A");
        linkedList.insertAtTail( "B");
        assertEquals(linkedList.getHeadItem(), "A");
        assertEquals(linkedList.getTailItem(), "B");
        assertEquals(linkedList.getListLength(), 2);

        // Items
        assertEquals(linkedList.getHeadItem(), "A");
        assertNotEquals(linkedList.getListHead(), "A");
        assertEquals(linkedList.getTailItem(), "B");
        assertNotEquals(linkedList.getListTail(), "B");

        // Null Items
        linkedList.clearList();
        assertNull(linkedList.getHeadItem());
        assertNull(linkedList.getHeadItem());
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testIsEmpty(LinkedList<String, ?> linkedList){
        // Empty
        assertNull(linkedList.getListHead());
        assertNull(linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 0);
        assertTrue(linkedList.isEmpty());

        // Not Empty
        linkedList.insertAtHead( "A");
        assertNotEquals(linkedList.getListHead(), null);
        assertNotEquals(linkedList.getListTail(), null);
        assertEquals(linkedList.getListLength(), 1);
        assertFalse(linkedList.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testClearList(LinkedList<String, ?> linkedList){
        // Empty
        linkedList.clearList();
        assertTrue(linkedList.isEmpty());

        // Not Empty
        linkedList.insertAtTail( "A");
        linkedList.insertAtTail( "B");
        linkedList.insertAtTail( "C");
        linkedList.insertAtTail( "D");
        linkedList.clearList();
        assertTrue(linkedList.isEmpty());
        assertNull(linkedList.getListHead());
        assertNull(linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 0);
        assertEquals(linkedList.getListHead(), linkedList.getListTail());
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testInsertAtHead(LinkedList<String, ?> linkedList){
        // One element
        linkedList.insertAtHead( "A");
        assertEquals(linkedList.getHeadItem(), "A");
        assertEquals(linkedList.getTailItem(), "A");
        assertEquals(linkedList.getListHead(), linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 1);

        // Elements
        linkedList.insertAtHead( "B");
        linkedList.insertAtHead( "C");
        linkedList.insertAtHead( "D");
        assertEquals(linkedList.getHeadItem(), "D");
        assertEquals(linkedList.getTailItem(), "A");
        assertNotEquals(linkedList.getListHead(), linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 4);
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testInsertAtTail(LinkedList<String, ?> linkedList){
        // One element
        linkedList.insertAtTail( "A");
        assertEquals(linkedList.getHeadItem(), "A");
        assertEquals(linkedList.getTailItem(), "A");
        assertEquals(linkedList.getListHead(), linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 1);

        // Elements
        linkedList.insertAtTail( "B");
        linkedList.insertAtTail( "C");
        linkedList.insertAtTail( "D");
        assertEquals(linkedList.getHeadItem(), "A");
        assertEquals(linkedList.getTailItem(), "D");
        assertNotEquals(linkedList.getListHead(), linkedList.getListTail());
        assertEquals(linkedList.getListLength(), 4);
    }

    @ParameterizedTest
    @MethodSource("linkedLists")
    public void testFindFirstOccurrence(LinkedList<String, ?> linkedList){
        // Empty
        Object ret = linkedList.findFirstOccurrence("A");
        assertNull(ret);


        linkedList.insertAtHead("A");
        linkedList.insertAtHead("B");
        linkedList.insertAtHead("C");
        linkedList.insertAtHead("D");

        // Head
        ret = linkedList.findFirstOccurrence("A");
        assertEquals(ret, linkedList.getListHead());
        // Tail
        ret = linkedList.findFirstOccurrence("D");
        assertEquals(ret, linkedList.getListTail());

        // Repeats
        linkedList.insertAtTail("A");
        ret = linkedList.findFirstOccurrence("A");
        assertEquals(ret, linkedList.getListHead());

        // Not found
        ret = linkedList.findFirstOccurrence("Z");
        assertNull(ret);
    }



}
