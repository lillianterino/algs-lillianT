package wpialgs.apis.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import wpialgs.apis.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    public List<Integer> compList;

    public LinkedListTest() {
        compList = new ArrayList<>();
    }

    /** - - - Constructor - - - - - - - - - - - - - - - - - */
    @Test
    public void testConstructor(){
        LinkedList testList = new LinkedList<Integer>();
        assertEquals(testList.getListLength(), 0);
        assertEquals(testList.getListHead(), null);
        assertEquals(testList.getListTail(), null);
    }

    /** - - - Accessor Methods - - - - - - - - - - - - - - */
    @Test
    public void testGetListLength(){
        LinkedList testList = new LinkedList<Integer>();
        assertEquals(testList.getListLength(), 0);
        testList.insertAtHead(0);
        assertEquals(testList.getListLength(), 1);
    }

    @Test
    public void testGetHeadTail(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        assertEquals(testList.getListHead(), testList.getListTail());
    }

    @Test
    public void testGetHeadData(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        assertEquals(testList.getHeadData(), 0);
    }

    @Test
    public void testGetTailData(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        assertEquals(testList.getTailData(), 0);
    }

    @Test
    public void testIsEmpty(){
        LinkedList testList = new LinkedList<Integer>();
        assertEquals(testList.isEmpty(), true);
        testList.insertAtHead(0);
        assertEquals(testList.isEmpty(), false);
    }

    @Test
    public void testIsFull(){
        LinkedList testList = new LinkedList<Integer>();
        assertEquals(testList.isFull(), false);
    }

    @Test
    public void testFindNode(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtTail(i);
        }
        assertEquals(testList.findNode(0), testList.getListHead());
        assertEquals(testList.findNode(4), testList.getListTail());
    }

    @Test
    public void testPrintList(){

    }

    /** - - - Mutator Methods - - - - - - - - - - - - - - */
    @Test
    public void testInsertAtHead(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        testList.insertAtHead(1);
        assertEquals(testList.getHeadData(), 1);
        assertEquals(testList.getTailData(), 0);
        assertEquals(testList.getListLength(), 2);
    }

    @Test
    public void testInsertAtTail(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtTail(0);
        testList.insertAtTail(1);
        assertEquals(testList.getHeadData(), 0);
        assertEquals(testList.getTailData(), 1);
        assertEquals(testList.getListLength(), 2);
    }

    @Test
    public void testInsertAfter(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        testList.insertAtTail(2);
        testList.insertAfter(1,0);
        compList.add(0);
        compList.add(1);
        compList.add(2);
        assertEquals(testList.toString(), compList.toString());
    }

    @Test
    public void testInsertBefore(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        testList.insertAtTail(2);
        testList.insertBefore(1,2);
        compList.add(0);
        compList.add(1);
        compList.add(2);
        assertEquals(testList.toString(), compList.toString());
    }

    @Test
    public void testRemoveFirst(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtTail(i);
        }
        testList.removeFirst();
        assertEquals(testList.getHeadData(), 1);
    }

    @Test
    public void testRemoveLast(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtHead(i);
        }
        testList.removeLast();
        assertEquals(testList.getTailData(), 1);
    }

    @Test
    public void testRemove(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtTail(i);
        }
        testList.remove(0);
        assertEquals(testList.getListLength(), 4);
        testList.remove(4);
        assertEquals(testList.getListLength(), 3);
    }

    @Test
    public void testReplaceNode(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtTail(i);
        }
        testList.replaceNode(1,0);
        assertEquals(testList.getHeadData(), 1);
        testList.replaceNode(5,4);
        assertEquals(testList.getTailData(), 5);
    }

    @Test
    public void testClear(){
        LinkedList testList = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.insertAtTail(i);
        }
        testList.clear();
        assertEquals(testList.getListLength(), 0);
    }

    /** - - - Implementations - - - - - - - - - - - - -  */
    @Test
    public void testToString(){
        LinkedList testList = new LinkedList<Integer>();
        testList.insertAtHead(0);
        testList.insertAtHead(1);
        compList.add(1);
        compList.add(0);
        assertEquals(testList.toString(), compList.toString());
    }


}
